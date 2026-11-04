package br.com.clyvo.vitalia.repository;

import br.com.clyvo.vitalia.entity.AppUser;
import br.com.clyvo.vitalia.enums.AppUserStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long> {

    Optional<AppUser> findByEmail(String email);

    List<AppUser> findDistinctByRoles_NameAndStatusOrderByFullNameAsc(
            String roleName,
            AppUserStatus status
    );
}