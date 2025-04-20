package br.com.fiap.mototrack_backend_java.controller;

import br.com.fiap.mototrack_backend_java.model.Movimentacao;
import br.com.fiap.mototrack_backend_java.service.MovimentacaoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController extends BaseController<Movimentacao, Long> {

    public MovimentacaoController(MovimentacaoService service) {
        super(service);
    }
}
