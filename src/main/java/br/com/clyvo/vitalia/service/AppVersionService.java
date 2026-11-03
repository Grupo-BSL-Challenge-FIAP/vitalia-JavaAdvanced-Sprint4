package br.com.clyvo.vitalia.service;

import br.com.clyvo.vitalia.dto.request.AppVersionRequest;
import br.com.clyvo.vitalia.dto.response.AppVersionResponse;
import br.com.clyvo.vitalia.entity.AppVersion;
import br.com.clyvo.vitalia.repository.AppVersionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AppVersionService {

    private final AppVersionRepository appVersionRepository;

    public AppVersionService(AppVersionRepository appVersionRepository) {
        this.appVersionRepository = appVersionRepository;
    }

    public AppVersionResponse create(AppVersionRequest request) {
        if (appVersionRepository.existsByVersion(request.version())) {
            throw new ResponseStatusException(
                    HttpStatus.CONFLICT,
                    "Esta versão já foi publicada."
            );
        }

        AppVersion appVersion = AppVersion.builder()
                .version(request.version())
                .commitHash(request.commitHash())
                .branch(request.branch())
                .publishedAt(LocalDateTime.now())
                .build();

        AppVersion savedAppVersion = appVersionRepository.save(appVersion);

        return toResponse(savedAppVersion);
    }

    public AppVersionResponse findByVersion(String version) {
        AppVersion appVersion = appVersionRepository.findByVersion(version)
                .orElseThrow(() ->
                        new ResponseStatusException(
                                HttpStatus.NOT_FOUND,
                                "Versão não encontrada."
                        )
                );

        return toResponse(appVersion);
    }

    public List<AppVersionResponse> findAll() {
        return appVersionRepository.findAll()
                .stream()
                .map(this::toResponse)
                .toList();
    }

    private AppVersionResponse toResponse(AppVersion appVersion) {
        return new AppVersionResponse(
                appVersion.getId(),
                appVersion.getVersion(),
                appVersion.getCommitHash(),
                appVersion.getBranch(),
                appVersion.getPublishedAt()
        );
    }
}