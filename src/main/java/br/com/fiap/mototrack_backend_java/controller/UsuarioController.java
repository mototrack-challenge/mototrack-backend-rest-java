package br.com.fiap.mototrack_backend_java.controller;

import br.com.fiap.mototrack_backend_java.interfaces.IBaseService;
import br.com.fiap.mototrack_backend_java.model.Usuario;
import br.com.fiap.mototrack_backend_java.service.UsuarioService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController extends BaseController<Usuario, Long> {

    public UsuarioController(UsuarioService service) {
        super(service);
    }
}
