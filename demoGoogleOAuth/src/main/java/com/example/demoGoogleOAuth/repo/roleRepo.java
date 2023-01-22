package com.example.demoGoogleOAuth.repo;

import com.example.demoGoogleOAuth.domain.Role;
import com.example.demoGoogleOAuth.domain.appUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface roleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}