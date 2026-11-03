package br.com.clyvo.vitalia.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "TB_VITALIA_APP_VERSION")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AppVersion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "VERSION", nullable = false, unique = true, length = 30)
    private String version;

    @Column(name = "COMMIT_HASH", nullable = false, length = 64)
    private String commitHash;

    @Column(name = "BRANCH", nullable = false, length = 100)
    private String branch;

    @Column(name = "PUBLISHED_AT", nullable = false, updatable = false)
    private LocalDateTime publishedAt;
}