package br.uniesp.si.techback.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "filmes")
public class Filme {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false, length = 100)
    private String titulo;

    @Column(columnDefinition = "TEXT")
    private String sinopse;

    @Column(nullable = false)
    private Integer ano;

    @Column(name = "duracao_minutos", nullable = false)
    private Integer duracaoMinutos;

    @Column(length = 50)
    private String genero;

    private LocalDateTime criadoEm;
    private LocalDateTime atualizadoEm;

    @PrePersist
    public void beforeInsert() {
        criadoEm = LocalDateTime.now();
        atualizadoEm = criadoEm;
    }

    @PreUpdate
    public void beforeUpdate() {
        atualizadoEm = LocalDateTime.now();
    }
}
