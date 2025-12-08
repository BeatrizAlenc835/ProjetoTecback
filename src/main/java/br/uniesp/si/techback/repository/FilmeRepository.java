package br.uniesp.si.techback.repository;

import br.uniesp.si.techback.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface FilmeRepository extends JpaRepository<Filme, UUID> {
}
