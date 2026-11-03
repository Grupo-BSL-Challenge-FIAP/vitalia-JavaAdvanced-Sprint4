package br.com.clyvo.vitalia.dto.response;

import java.time.LocalDateTime;

public record AppVersionResponse(
        Long id,
        String version,
        String commitHash,
        String branch,
        LocalDateTime publishedAt
) {}