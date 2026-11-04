package br.com.clyvo.vitalia.service;

import br.com.clyvo.vitalia.dto.response.VeterinarianResponse;
import br.com.clyvo.vitalia.enums.AppUserStatus;
import br.com.clyvo.vitalia.repository.AppUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VeterinarianService {

    private final AppUserRepository appUserRepository;

    public List<VeterinarianResponse> findAll() {

        return appUserRepository
                .findDistinctByRoles_NameAndStatusOrderByFullNameAsc(
                        "VETERINARIAN",
                        AppUserStatus.ACTIVE
                )
                .stream()
                .map(user -> new VeterinarianResponse(
                        user.getId(),
                        user.getFullName()
                ))
                .toList();
    }
}