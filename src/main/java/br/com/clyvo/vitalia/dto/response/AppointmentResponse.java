package br.com.clyvo.vitalia.dto.response;

import java.time.LocalDateTime;

public record AppointmentResponse(
        Long id,
        LocalDateTime appointmentDate,
        String status,
        String notes,
        String appointmentType,
        String location,
        Long petId,
        Long veterinarianId,
        String veterinarianName
) {}