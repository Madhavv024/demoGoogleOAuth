package com.example.demoGoogleOAuth.service;

import com.example.demoGoogleOAuth.domain.Role;
import com.example.demoGoogleOAuth.domain.appUser;
import com.example.demoGoogleOAuth.repo.*;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @RequiredArgsConstructor @Transactional @Slf4j
public class appUserServiceImpl implements userService{
    private final userRepo userRepo;
    private final roleRepo roleRepo;

    @Override
    public appUser saveUser(appUser user) {
        log.info("Saving new User {} to the database" , user.getName());
        return userRepo.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        log.info("Saving new Role {} to the database" , role.getName());

        return roleRepo.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        log.info("Adding role {} to user {}" , roleName, username);
        appUser user = userRepo.findByUsername(username);
        Role role = roleRepo.findByName(roleName);
        user.getRoles().add(role);
    }

    @Override
    public appUser getUser(String username) {
        log.info("Fetching user {}" , username);
        return userRepo.findByUsername(username);
    }

    @Override
    public List<appUser> getUsers() {
        log.info("Fetching all the users");
        return userRepo.findAll();
    }
}
