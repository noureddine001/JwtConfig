package org.value.springbootjwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.value.springbootjwt.models.ERole;
import org.value.springbootjwt.models.Role;
import org.value.springbootjwt.models.User;
import org.value.springbootjwt.repository.RoleRepository;
import org.value.springbootjwt.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringBootJwtApplication implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;


	public static void main(String[] args) {
		SpringApplication.run(SpringBootJwtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	//userRepository.save(new User("admin", "admin@bezkoder.com", "admin1234"));
	//	userRepository.save(new User("mod", "mod@bezkoder.com", "mod1234"));
	//	userRepository.save(new User("user", "user@bezkoder.com", "user1234"));
	}
}
