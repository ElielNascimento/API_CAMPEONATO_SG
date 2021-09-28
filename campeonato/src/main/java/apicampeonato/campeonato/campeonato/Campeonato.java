package apicampeonato.campeonato.campeonato;

import apicampeonato.campeonato.time.Time;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "campeonato")
public class Campeonato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String competicao;

    @CreationTimestamp
    @Temporal(TemporalType.DATE)
    private Date dataInicial;

    @Temporal(TemporalType.DATE)
    private Date dataFinal;

    @JoinColumn(name = "time_id")
    @ManyToMany
    private List<Time> timeList;

    public Campeonato() {
    }

    public Campeonato(String competicao, Date dataAtual, Date dataFinal) {
        this.competicao = competicao;
        this.dataInicial= dataAtual;
        this.dataFinal = dataFinal;
    }

    public Long getId() {
        return id;
    }

    public String getCompeticao() {
        return competicao;
    }

    public void setCompeticao(String competicao) {
        this.competicao = competicao;
    }

    public List<Time> getTimeList() {
        return timeList;
    }

    public void setTimeList(List<Time> timeList) {
        this.timeList = timeList;
    }

    public Date getDataAtual() {
        return dataInicial;
    }

    public void setDataInicial(Date dataAtual) {
        this.dataInicial= dataAtual;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }
}
