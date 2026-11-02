package br.com.clyvo.vitalia.repository;

import br.com.clyvo.vitalia.entity.MeasurementEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MeasurementRepository extends JpaRepository<MeasurementEntity, Long> {

    Optional<MeasurementEntity> findTopByPetIdOrderByMeasurementDateDesc(Long petId);
}