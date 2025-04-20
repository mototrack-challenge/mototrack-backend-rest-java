package br.com.fiap.mototrack_backend_java.controller;

import br.com.fiap.mototrack_backend_java.model.Status;
import br.com.fiap.mototrack_backend_java.service.StatusService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")
public class StatusController extends BaseController<Status, Long> {

    public StatusController(StatusService service) {
        super(service);
    }
}
