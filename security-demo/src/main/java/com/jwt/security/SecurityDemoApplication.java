package com.jwt.security;

import com.jwt.security.entity.User;
import com.jwt.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SecurityDemoApplication {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@PostConstruct
	public void init(){
		List<User> users= Stream.of(
				new User(1,"shiv1",bCryptPasswordEncoder.encode("pass1"),"ROLE_ADMIN","shiv1@gmail.com"),
				new User(2,"shiv2",bCryptPasswordEncoder.encode("pass2"),"ROLE_SUPER_ADMIN","shiv2@gmail.com"),
				new User(3,"shiv3",bCryptPasswordEncoder.encode("pass3"),"ROLE_USER","shiv3@gmail.com"),
				new User(2,"shiv4",bCryptPasswordEncoder.encode("pass4"),"ROLE_SUPER_ADMIN","shiv4@gmail.com"),
				new User(3,"shiv5",bCryptPasswordEncoder.encode("pass5"),"ROLE_USER","shiv5@gmail.com"),
				new User(2,"shiv6",bCryptPasswordEncoder.encode("pass6"),"ROLE_SUPER_ADMIN","shiv6@gmail.com"),
				new User(3,"shiv7",bCryptPasswordEncoder.encode("pass7"),"ROLE_USER","shiv7@gmail.com"),
				new User(2,"shiv8",bCryptPasswordEncoder.encode("pass8"),"ROLE_SUPER_ADMIN","shiv8@gmail.com"),
				new User(3,"shiv9",bCryptPasswordEncoder.encode("pass9"),"ROLE_USER","shiv9@gmail.com")
		).collect(Collectors.toList());
		userRepository.saveAll(users);
	}

	public static void main(String[] args) {
		SpringApplication.run(SecurityDemoApplication.class, args);
	}

}
