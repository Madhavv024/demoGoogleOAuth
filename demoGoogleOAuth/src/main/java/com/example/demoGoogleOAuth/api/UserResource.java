package com.example.demoGoogleOAuth.api;

import com.example.demoGoogleOAuth.domain.appUser;
import com.example.demoGoogleOAuth.service.userService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController @RequestMapping("/api")
@RequiredArgsConstructor
public class UserResource {
    private final userService userService;
    @GetMapping("/users")
    public ResponseEntity<List<appUser>> getUsers(){
        return ResponseEntity.ok().body(userService.getUsers());
    }
}
