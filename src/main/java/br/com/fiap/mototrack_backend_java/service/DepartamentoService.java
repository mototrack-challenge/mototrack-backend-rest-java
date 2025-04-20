package br.com.fiap.mototrack_backend_java.service;

import br.com.fiap.mototrack_backend_java.model.Departamento;
import br.com.fiap.mototrack_backend_java.repository.DepartamentoRepository;

public class DepartamentoService extends BaseServiceImpl<Departamento, Long, DepartamentoRepository> {

    public DepartamentoService(DepartamentoRepository repository) {
        super(repository);
    }
}
