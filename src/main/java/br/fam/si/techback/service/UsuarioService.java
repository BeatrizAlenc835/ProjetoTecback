package br.fam.si.techback.service;

import br.fam.si.techback.dto.usuario.UsuarioCreateDTO;
import br.fam.si.techback.dto.usuario.UsuarioResponseDTO;
import br.fam.si.techback.model.Usuario;
import br.fam.si.techback.repository.UsuarioRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public UsuarioResponseDTO criar(UsuarioCreateDTO dto) {
        Usuario usuario = new Usuario();
        usuario.setNomeCompleto(dto.nomeCompleto());
        usuario.setDataNascimento(dto.dataNascimento());
        usuario.setEmail(dto.email());
        usuario.setSenhaHash(dto.senha());
        usuario.setCpfCnpj(dto.cpfCnpj());
        usuario.setPerfil(dto.perfil());

        Usuario salvo = repository.save(usuario);
        return toResponse(salvo);
    }

    public UsuarioResponseDTO buscarPorId(UUID id) {
        Usuario u = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Usuário não encontrado"));
        return toResponse(u);
    }

    private UsuarioResponseDTO toResponse(Usuario u) {
        return new UsuarioResponseDTO(
                u.getId(),
                u.getNomeCompleto(),
                u.getEmail(),
                u.getPerfil(),
                u.getCpfCnpj()
        );
    }
}
