package br.fam.si.techback.dto.favorito;

import java.util.UUID;

public record FavoritoUpdateDTO(
        UUID usuarioId,
        UUID conteudoId
) {}
