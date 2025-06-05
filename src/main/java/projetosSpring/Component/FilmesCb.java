package projetosSpring.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import projetosSpring.Entity.DadosFilmes;
import projetosSpring.Repository.FilmesRepository;

@Component
public class FilmesCb implements CommandLineRunner {

    private final FilmesRepository repository;

    @Autowired
    public FilmesCb(FilmesRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        repository.save(new DadosFilmes(1, "Divertida Mente 2", "Animação/Família", 0));
        repository.save(new DadosFilmes(2, "Moana 2", "Animação/Aventura", 0));
        repository.save(new DadosFilmes(3, "Deadpool & Wolverine", "Ação/Comédia", 0));
        repository.save(new DadosFilmes(4, "Meu Malvado Favorito 4", "Animação/Comédia", 0));
        repository.save(new DadosFilmes(5, "Mufasa: O Rei Leão", "Animação/Fantasia", 0));
        repository.save(new DadosFilmes(6, "Ainda Estou Aqui", "Drama/Biografia", 0));
        repository.save(new DadosFilmes(7, "O Auto da Compadecida 2", "Comédia/Fantasia", 0));
        repository.save(new DadosFilmes(8, "Sonic 3: O Filme", "Aventura/Família", 0));
        repository.save(new DadosFilmes(9, "É Assim Que Acaba", "Drama/Romance", 0));
        repository.save(new DadosFilmes(10, "Planeta dos Macacos - O Reinado", "Aventura/Ficção Científica", 0));
        repository.save(new DadosFilmes(11, "Venom: A Última Rodada", "Ação/Fantasia", 0));
        repository.save(new DadosFilmes(12, "A Forja: O Poder da Transformação", "Aventura/Fantasia", 0));
        repository.save(new DadosFilmes(13, "Gladiador II", "Ação/Drama", 0));
        repository.save(new DadosFilmes(14, "Coringa: Delírio a Dois", "Drama/Musical", 0));
        repository.save(new DadosFilmes(15, "Godzilla e Kong: O Novo Império", "Ação/Fantasia", 0));
        repository.save(new DadosFilmes(16, "Kung Fu Panda 4", "Animação/Aventura", 0));
        repository.save(new DadosFilmes(17, "Todos Menos Você", "Comédia/Romance", 0));
        repository.save(new DadosFilmes(18, "Duna: Parte 2", "Ficção Científica/Drama", 0));
        repository.save(new DadosFilmes(19, "Wish: o Poder dos Desejos", "Animação/Fantasia", 0));
        repository.save(new DadosFilmes(20, "Homem-Aranha: Além do Horizonte", "Ação/Aventura", 0));

    }
}
