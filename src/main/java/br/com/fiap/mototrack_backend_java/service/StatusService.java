package br.com.fiap.mototrack_backend_java.service;

import br.com.fiap.mototrack_backend_java.model.Status;
import br.com.fiap.mototrack_backend_java.repository.StatusRepository;
import br.com.fiap.mototrack_backend_java.repository.UsuarioRepository;

public class StatusService extends BaseServiceImpl<Status, Long, StatusRepository> {

    public StatusService(StatusRepository repository) {
        super(repository);
    }
}
