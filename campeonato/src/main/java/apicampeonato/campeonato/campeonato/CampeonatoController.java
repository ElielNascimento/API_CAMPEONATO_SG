package apicampeonato.campeonato.campeonato;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/campeonato")
public class CampeonatoController {

    @Autowired
    private CampeonatoService campeonatoService;

    @GetMapping
    private List<Campeonato> campeonatoList() {
        return campeonatoService.buscarTimes();
    }

    @GetMapping("/{id}")
    private Campeonato campeonato(@PathVariable Long id) {
        return campeonatoService.buscarId(id);
    }

    @PostMapping
    private Campeonato campeonato(@RequestBody Campeonato campeonato) {
        return campeonatoService.adicionarCampeonato(campeonato);
    }
}
