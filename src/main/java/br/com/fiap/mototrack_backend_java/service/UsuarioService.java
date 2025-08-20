package br.com.fiap.mototrack_backend_java.service;

import br.com.fiap.mototrack_backend_java.dto.UsuarioRequestDTO;
import br.com.fiap.mototrack_backend_java.dto.UsuarioResponseDTO;
import br.com.fiap.mototrack_backend_java.mapper.UsuarioMapper;
import br.com.fiap.mototrack_backend_java.model.Usuario;
import br.com.fiap.mototrack_backend_java.repository.UsuarioRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<UsuarioResponseDTO> listarTodos() {
        return usuarioRepository.findAll()
                .stream()
                .map(UsuarioMapper::toResponseDTO)
                .collect(Collectors.toList());
    }

    public UsuarioResponseDTO buscarPorId(Long id) {
        var usuario = buscarEntidadeUsuarioPorId(id);
        return UsuarioMapper.toResponseDTO(usuario);
    }

    public UsuarioResponseDTO salvar(UsuarioRequestDTO usuarioRequestDTO) {
        var usuario = usuarioRepository.save(UsuarioMapper.toEntity(usuarioRequestDTO));
        return UsuarioMapper.toResponseDTO(usuario);
    }

    public UsuarioResponseDTO atualizar(Long id, UsuarioRequestDTO usuarioRequestDTO) {
        var usuarioAtual = buscarEntidadeUsuarioPorId(id);

        usuarioAtual.setId(id);
        usuarioAtual.setNome(usuarioRequestDTO.getNome());
        usuarioAtual.setEmail(usuarioRequestDTO.getEmail());
        usuarioAtual.setSenha(usuarioAtual.getSenha());

        var usuarioAtualizado = usuarioRepository.save(usuarioAtual);
        return UsuarioMapper.toResponseDTO(usuarioAtualizado);
    }

    public void deletar(Long id) {
        var usuario = buscarEntidadeUsuarioPorId(id);
        usuarioRepository.delete(usuario);
    }

    public Usuario buscarEntidadeUsuarioPorId(Long id) {
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Usuário com id: " + id + " não encontrado"));
    }
}
