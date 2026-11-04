package br.com.clyvo.vitalia.controller;

import br.com.clyvo.vitalia.dto.response.VeterinarianResponse;
import br.com.clyvo.vitalia.service.VeterinarianService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("veterinarians")
@RequiredArgsConstructor
public class VeterinarianController {

    private final VeterinarianService service;

    @GetMapping
    public ResponseEntity<List<VeterinarianResponse>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }
}