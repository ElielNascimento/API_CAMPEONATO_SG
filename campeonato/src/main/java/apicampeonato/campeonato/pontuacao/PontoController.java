package apicampeonato.campeonato.pontuacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ponto")
public class PontoController {

    @Autowired
    private PontoService pontoService;

    @GetMapping
    private List<Ponto> buscarPontos() {
        return pontoService.buscarPontos();
    }

    @GetMapping("/{id}")
    private Ponto buscarPontosPeloId(@PathVariable Long id) {
        return pontoService.buscarPontoPeloId(id);
    }

    @PostMapping
    private Ponto adicionarPonto(@RequestBody Ponto ponto) {
        return pontoService.adicionarPonto(ponto);
    }
}

