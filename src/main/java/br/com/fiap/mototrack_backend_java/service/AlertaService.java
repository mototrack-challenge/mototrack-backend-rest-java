package br.com.fiap.mototrack_backend_java.service;

import br.com.fiap.mototrack_backend_java.model.Alerta;
import br.com.fiap.mototrack_backend_java.repository.AlertaRepository;
import org.springframework.stereotype.Service;

@Service
public class AlertaService extends BaseServiceImpl<Alerta, Long, AlertaRepository> {

    public AlertaService(AlertaRepository repository) {
        super(repository);
    }
}
