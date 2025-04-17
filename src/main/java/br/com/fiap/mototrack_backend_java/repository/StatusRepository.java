package br.com.fiap.mototrack_backend_java.repository;

import br.com.fiap.mototrack_backend_java.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Long> {
}
