package br.com.clyvo.vitalia.dto.request;

import br.com.clyvo.vitalia.enums.AppointmentStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.LocalDateTime;

public record AppointmentRequest(
        @NotNull(message = "A data da consulta é obrigatória")
        LocalDateTime appointmentDate,

        AppointmentStatus status,

        String notes,

        @NotBlank(message = "O tipo da consulta é obrigatório")
        @Size(max = 100, message = "O tipo da consulta deve ter no máximo 100 caracteres")
        String appointmentType,

        @NotBlank(message = "O local da consulta é obrigatório")
        @Size(max = 255, message = "O local da consulta deve ter no máximo 255 caracteres")
        String location,

        @NotNull(message = "O ID do pet é obrigatório")
        Long petId,

        @NotNull(message = "O ID do veterinário é obrigatório")
        Long veterinarianId
) {}