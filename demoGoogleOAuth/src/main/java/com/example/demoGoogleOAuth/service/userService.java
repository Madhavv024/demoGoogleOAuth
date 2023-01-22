package com.example.demoGoogleOAuth.service;

import com.example.demoGoogleOAuth.domain.Role;
import com.example.demoGoogleOAuth.domain.appUser;

import java.util.List;

public interface userService {
    appUser saveUser(appUser user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    appUser getUser(String username);
    List<appUser> getUsers();
}
