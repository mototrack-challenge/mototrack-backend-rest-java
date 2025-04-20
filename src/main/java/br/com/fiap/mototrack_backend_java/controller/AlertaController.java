package br.com.fiap.mototrack_backend_java.controller;

import br.com.fiap.mototrack_backend_java.model.Alerta;
import br.com.fiap.mototrack_backend_java.service.AlertaService;
import br.com.fiap.mototrack_backend_java.service.MotoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alertas")
public class AlertaController extends BaseController<Alerta, Long> {

    public AlertaController(AlertaService service) {
        super(service);
    }
}
