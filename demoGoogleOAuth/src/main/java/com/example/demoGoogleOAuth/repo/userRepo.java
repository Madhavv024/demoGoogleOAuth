package com.example.demoGoogleOAuth.repo;

import com.example.demoGoogleOAuth.domain.appUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepo extends JpaRepository<appUser, Long> {
    appUser findByUsername(String username);
}
