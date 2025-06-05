package projetosSpring.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;


@Entity
@Validated
public class DadosFilmes {
    @NotNull(message = "O ID é obrigatório")
    @Positive(message = "O ID deve ser um número positivo")
    @Id

    private Long id;
    private String nome;
    private String descricao;
    private int votacao;

    public DadosFilmes() {

    }


    public DadosFilmes(long id, String nome, String descricao, int votacao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.votacao = votacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getVotacao() {
        return votacao;
    }

    public void setVotacao(int votacao) {
        this.votacao = votacao;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DadosFilmes filmes = (DadosFilmes) o;
        return votacao == filmes.votacao && Objects.equals(id, filmes.id) && Objects.equals(nome, filmes.nome) && Objects.equals(descricao, filmes.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, descricao, votacao);
    }
}
