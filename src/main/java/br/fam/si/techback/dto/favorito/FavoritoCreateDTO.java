package br.fam.si.techback.dto.favorito;

import jakarta.validation.constraints.NotNull;
import java.util.UUID;

public record FavoritoCreateDTO(
        @NotNull UUID usuarioId,
        @NotNull UUID conteudoId
) {}
