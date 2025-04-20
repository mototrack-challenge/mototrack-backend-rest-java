package br.com.fiap.mototrack_backend_java.service;

import br.com.fiap.mototrack_backend_java.model.Alerta;
import br.com.fiap.mototrack_backend_java.repository.AlertaRepository;
import br.com.fiap.mototrack_backend_java.repository.UsuarioRepository;

public class AlertaService extends BaseServiceImpl<Alerta, Long, AlertaRepository> {

    public AlertaService(AlertaRepository repository) {
        super(repository);
    }
}
