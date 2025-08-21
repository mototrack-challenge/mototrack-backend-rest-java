package br.com.fiap.mototrack_backend_java.repository;

import br.com.fiap.mototrack_backend_java.model.Movimentacao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Long> {
    Page<Movimentacao> findAllByOrderByIdAsc(Pageable pageable);
}
