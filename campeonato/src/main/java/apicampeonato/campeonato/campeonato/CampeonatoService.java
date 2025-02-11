package apicampeonato.campeonato.campeonato;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class CampeonatoService {
    @Autowired
    private CampeonatoRepository campeonatoRepository;

    public List<Campeonato> buscarTimes() {
        return campeonatoRepository.findAll();
    }

    public Campeonato buscarId(Long id) {
        return campeonatoRepository.getById(id);
    }

    public Campeonato adicionarCampeonato(Campeonato campeonato) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 3);
        campeonato.setDataInicial(Calendar.getInstance().getTime());
        campeonato.setDataFinal(calendar.getTime());
        return campeonatoRepository.save(campeonato);
    }
}
