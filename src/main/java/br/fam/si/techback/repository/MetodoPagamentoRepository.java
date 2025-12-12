package br.fam.si.techback.repository;

import br.fam.si.techback.model.MetodoPagamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface MetodoPagamentoRepository extends JpaRepository<MetodoPagamento, UUID> {

    List<MetodoPagamento> findByUsuarioId(UUID usuarioId);

}
