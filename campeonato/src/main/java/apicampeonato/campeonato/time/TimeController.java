package apicampeonato.campeonato.time;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/time")
public class TimeController {

    @Autowired
    private TimeService timeService;

    @GetMapping
    private List<Time> buscarTodosTimesCriados(Long id) {
        return timeService.buscarTodosTimes();
    }

    @GetMapping("/{id}")
    private Time buscarTimePeloiD(@PathVariable Long id) {
        return timeService.buscarTimePeloId(id);
    }

    @PostMapping
    private Time adicionarTime(@RequestBody Time time) {
        return timeService.adicionarTime(time);
    }
}
