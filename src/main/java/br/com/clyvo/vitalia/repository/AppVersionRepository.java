package br.com.clyvo.vitalia.repository;

import br.com.clyvo.vitalia.entity.AppVersion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AppVersionRepository extends JpaRepository<AppVersion, Long> {

    Optional<AppVersion> findByVersion(String version);

    boolean existsByVersion(String version);
}