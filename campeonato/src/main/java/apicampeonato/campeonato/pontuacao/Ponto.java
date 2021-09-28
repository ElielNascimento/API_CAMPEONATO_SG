package apicampeonato.campeonato.pontuacao;

import javax.persistence.*;

@Entity
@Table(name = "ponto")
public class Ponto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ponto")
    private Integer ponto;

    public Ponto() {
    }
    public Ponto(Integer ponto) {
        this.ponto = ponto;
    }

    public Integer getPonto() {
        return ponto;
    }

    public void setPonto(Integer ponto) {
        this.ponto = ponto;
    }

    public Long getId() {
        return id;
    }
}
