package br.com.fiap.mototrack_backend_java.service;

import br.com.fiap.mototrack_backend_java.model.Moto;
import br.com.fiap.mototrack_backend_java.repository.MotoRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public class MotoService extends BaseServiceImpl<Moto, Long, MotoRepository> {

    public MotoService(MotoRepository repository) {
        super(repository);
    }
}
