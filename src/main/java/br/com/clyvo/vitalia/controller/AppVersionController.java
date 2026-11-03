package br.com.clyvo.vitalia.controller;

import br.com.clyvo.vitalia.dto.request.AppVersionRequest;
import br.com.clyvo.vitalia.dto.response.AppVersionResponse;
import br.com.clyvo.vitalia.service.AppVersionService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app-versions")
public class AppVersionController {

    private final AppVersionService appVersionService;

    public AppVersionController(AppVersionService appVersionService) {
        this.appVersionService = appVersionService;
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<AppVersionResponse> create(@Valid @RequestBody AppVersionRequest request) {
        AppVersionResponse response = appVersionService.create(request);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/{version}")
    public ResponseEntity<AppVersionResponse> findByVersion(@PathVariable String version) {
        return ResponseEntity.ok(appVersionService.findByVersion(version));
    }

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<AppVersionResponse>> findAll() {
        return ResponseEntity.ok(appVersionService.findAll());
    }
}