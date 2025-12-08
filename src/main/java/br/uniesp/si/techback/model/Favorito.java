package br.uniesp.si.techback.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "favoritos")
public class Favorito {

    @EmbeddedId
    private FavoritoId id;

    @Column(nullable = false)
    private LocalDateTime criadoEm;

    @PrePersist
    public void beforeInsert() {
        criadoEm = LocalDateTime.now();
    }
}
