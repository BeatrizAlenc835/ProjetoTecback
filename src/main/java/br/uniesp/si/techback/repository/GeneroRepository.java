package br.uniesp.si.techback.repository;

import br.uniesp.si.techback.model.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface GeneroRepository extends JpaRepository<Genero, UUID> {

    boolean existsByNomeIgnoreCase(String nome);
}
