package br.com.clyvo.vitalia.dto.response;

import java.time.LocalDateTime;

public record MeasurementDetailResponse(
        Long id,
        Long petId,
        Double activityLevel,
        Double sleepHours,
        Double heartRate,
        Double respiratoryRate,
        Double temperature,
        Double behaviorScore,
        LocalDateTime measurementDate
) {}