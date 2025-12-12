package br.fam.si.techback.dto.assinatura;

import java.util.UUID;

public record AssinaturaUpdateDTO(
        UUID planoId,
        UUID metodoPagamentoId
) {}
