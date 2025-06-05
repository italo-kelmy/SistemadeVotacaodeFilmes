package projetosSpring.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projetosSpring.Entity.DadosFilmes;

import java.util.List;


@Repository
public interface FilmesRepository  extends JpaRepository<DadosFilmes, Long> {

    List<DadosFilmes> findAllByOrderByVotacaoDesc();



}
