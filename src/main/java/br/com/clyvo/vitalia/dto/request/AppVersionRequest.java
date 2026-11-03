package br.com.clyvo.vitalia.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record AppVersionRequest(

        @NotBlank(message = "A versão é obrigatória.")
        @Size(max = 30, message = "A versão deve possuir no máximo 30 caracteres.")
        String version,

        @NotBlank(message = "O hash do commit é obrigatório.")
        @Size(max = 64, message = "O hash do commit deve possuir no máximo 64 caracteres.")
        String commitHash,

        @NotBlank(message = "A branch é obrigatória.")
        @Size(max = 100, message = "A branch deve possuir no máximo 100 caracteres.")
        String branch

) {
}