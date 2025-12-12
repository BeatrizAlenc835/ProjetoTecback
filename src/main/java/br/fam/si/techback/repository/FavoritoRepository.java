package br.fam.si.techback.repository;

import br.fam.si.techback.model.Favorito;
import br.fam.si.techback.model.FavoritoId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface FavoritoRepository extends JpaRepository<Favorito, FavoritoId> {

    List<Favorito> findByUsuarioIdOrderByCriadoEmDesc(UUID usuarioId);

}
