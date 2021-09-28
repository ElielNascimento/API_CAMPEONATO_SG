package apicampeonato.campeonato.time;

import apicampeonato.campeonato.pontuacao.Ponto;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "time")
public class Time {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(table = "time_id")
    private Long id;
    private String nome;

    @JoinColumn(name = "ponto_id")
    @ManyToMany
    @OrderBy("ponto desc")
    private List<Ponto> pontoList;

    public Time() {
    }

    public Time(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Ponto> getPontoList() {
        return pontoList;
    }

    public void setPontoList(List<Ponto> pontoList) {
        this.pontoList = pontoList;
    }
}
