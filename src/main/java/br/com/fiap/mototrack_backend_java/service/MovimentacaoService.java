package br.com.fiap.mototrack_backend_java.service;

import br.com.fiap.mototrack_backend_java.model.Movimentacao;
import br.com.fiap.mototrack_backend_java.repository.MovimentacaoRepository;
import org.springframework.stereotype.Service;

@Service
public class MovimentacaoService extends BaseServiceImpl<Movimentacao, Long, MovimentacaoRepository> {

    public MovimentacaoService(MovimentacaoRepository repository) {
        super(repository);
    }
}
