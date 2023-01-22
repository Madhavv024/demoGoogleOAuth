package com.example.demoGoogleOAuth;

import com.example.demoGoogleOAuth.domain.Role;
import com.example.demoGoogleOAuth.domain.appUser;
import com.example.demoGoogleOAuth.service.userService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class DemoGoogleOAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoGoogleOAuthApplication.class, args);
	}

	@Bean
	CommandLineRunner run(userService userService){
		return args -> {
			userService.saveRole(new Role(1, "Role_User"));
			userService.saveRole(new Role(2, "Role_Manager"));
			userService.saveRole(new Role(3, "Role_Admin"));
			userService.saveRole(new Role(4, "Role_Super_Admin"));

			userService.saveUser(new appUser( "John Travolta" , "John" , "1234" , new ArrayList<>()));
			userService.saveUser(new appUser( "Madhavv Tthukral" , "Madhavv" , "1234" , new ArrayList<>()));
			userService.saveUser(new appUser( "Ishikaa Gupta" , "Ishu" , "1234" , new ArrayList<>()));
			userService.saveUser(new appUser( "Will Smit" , "Will" , "1234" , new ArrayList<>()));


			userService.addRoleToUser("John" , "Role_User");
			userService.addRoleToUser("Will" , "Role_Manager");
			userService.addRoleToUser("Madhavv" , "Role_Manager");
			userService.addRoleToUser("Madhavv" , "Role_Admin");
			userService.addRoleToUser("Ishu" , "Role_Super_Admin");


		};
	}

}
