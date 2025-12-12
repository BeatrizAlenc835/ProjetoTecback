package br.fam.si.techback.dto.usuario;

import br.fam.si.techback.dto.endereco.EnderecoUpdateDTO;
import jakarta.validation.constraints.Size;

public record UsuarioUpdateDTO(
        @Size(max = 150) String nomeCompleto,
        EnderecoUpdateDTO endereco
) {}
