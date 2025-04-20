package br.com.fiap.mototrack_backend_java.controller;

import br.com.fiap.mototrack_backend_java.model.Departamento;
import br.com.fiap.mototrack_backend_java.service.DepartamentoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departamentos")
public class DepartamentoController extends BaseController<Departamento, Long> {

    public DepartamentoController(DepartamentoService service) {
        super(service);
    }
}
