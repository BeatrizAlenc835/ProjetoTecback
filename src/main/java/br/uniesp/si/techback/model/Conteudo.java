package br.uniesp.si.techback.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "conteudo")
public class Conteudo {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false, length = 200)
    private String titulo;

    @Column(nullable = false, length = 10)
    private String tipo; // FILME | SERIE

    @Column(nullable = false)
    private Integer ano;

    @Column(name = "duracao_minutos", nullable = false)
    private Integer duracaoMinutos;

    @Column(nullable = false, precision = 4, scale = 2)
    private BigDecimal relevancia;

    @Column(columnDefinition = "TEXT")
    private String sinopse;

    @Column(name = "trailer_url", length = 500)
    private String trailerUrl;

    @Enumerated(EnumType.STRING)
    @Column(length = 50)
    private Genero genero;

    @CreationTimestamp
    @Column(name = "criado_em", nullable = false, updatable = false)
    private LocalDateTime criadoEm;

    @UpdateTimestamp
    @Column(name = "atualizado_em", nullable = false)
    private LocalDateTime atualizadoEm;
}
