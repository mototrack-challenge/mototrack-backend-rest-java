package br.com.fiap.mototrack_backend_java.service;

import br.com.fiap.mototrack_backend_java.dto.MotoResponseDTO;
import br.com.fiap.mototrack_backend_java.mapper.MotoMapper;
import br.com.fiap.mototrack_backend_java.repository.MovimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MovimentacaoService  {

    @Autowired
    private MovimentacaoRepository movimentacaoRepository;

    @Transactional(readOnly = true)
    public Page<> listarTodos(Pageable pageable) {
        return motoRepository.findAllByOrderByIdAsc(pageable)
                .map(MotoMapper::toResponseDTO);
    }
}
