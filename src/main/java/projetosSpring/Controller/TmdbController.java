package projetosSpring.Controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projetosSpring.Entity.DadosFilmes;
import projetosSpring.Services.TmdbClient;

import java.util.List;


@RestController
public class TmdbController {
    private final TmdbClient client;

    @Autowired
    public TmdbController(TmdbClient client) {
        this.client = client;
    }

    @GetMapping("/filmes")
    public List<DadosFilmes> filmes() {
        return client.filmes();
    }


    @PostMapping("/filmes/votacao")
    public ResponseEntity<?> filmesVotacao(@RequestBody @Valid DadosFilmes request) {
        Long id = request.getId();

        return client.votacaoFilmes(id);
    }


    @GetMapping("/filmes/votacao/ranking")
    public List<DadosFilmes> filmesVotacao() {

        return client.ranking();
    }

}
