package apicampeonato.campeonato.time;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimeService {

    @Autowired
    private TimeRepository timeRepository;

    public List<Time> buscarTodosTimes() {
        return timeRepository.findAll();
    }

    public Time buscarTimePeloId(Long id) {
        return timeRepository.getById(id);
    }

    public Time adicionarTime(Time time) {
        return timeRepository.save(time);
    }
}
