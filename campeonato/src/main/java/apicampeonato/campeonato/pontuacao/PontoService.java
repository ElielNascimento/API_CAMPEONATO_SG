package apicampeonato.campeonato.pontuacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PontoService {


    @Autowired
    private PontoRepository pontoRepository;

    public List<Ponto> buscarPontos() {
        return pontoRepository.findAll();
    }

    public Ponto buscarPontoPeloId(Long id) {
        return pontoRepository.getById(id);
    }

    public Ponto adicionarPonto(Ponto ponto) {
        return pontoRepository.save(ponto);
    }
}
