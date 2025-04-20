package br.com.fiap.mototrack_backend_java.controller;

import br.com.fiap.mototrack_backend_java.interfaces.IBaseService;
import br.com.fiap.mototrack_backend_java.model.Moto;
import br.com.fiap.mototrack_backend_java.service.MotoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/motos")
public class MotoController extends BaseController<Moto, Long> {

    public MotoController(MotoService service) {
        super(service);
    }
}
