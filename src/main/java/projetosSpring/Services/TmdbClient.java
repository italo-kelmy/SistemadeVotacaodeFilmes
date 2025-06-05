package projetosSpring.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import projetosSpring.Entity.DadosFilmes;
import projetosSpring.Repository.FilmesRepository;

import java.util.List;


@Service
public class TmdbClient {

    private final FilmesRepository repository;

    @Autowired
    public TmdbClient(FilmesRepository repository) {
        this.repository = repository;
    }


    public List<DadosFilmes> filmes() {
        return repository.findAll();
    }


    public ResponseEntity<?> votacaoFilmes(Long id) {
        DadosFilmes filme = repository.findById(id).orElseThrow();

        if (id.equals(filme.getId())) {
            filme.setVotacao(filme.getVotacao() + 1);
            return ResponseEntity.ok(repository.save(filme));
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Por favor, coloque um id válido");

    }


    public List<DadosFilmes> ranking() {
        return repository.findAllByOrderByVotacaoDesc();
    }


}
