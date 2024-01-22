package com.example.pagination.bookstore;

import com.example.pagination.bookstore.User.User;
import com.example.pagination.bookstore.User.UserRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.IntStream;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	CommandLineRunner run(UserRepo userRepo) {
		return args -> IntStream.rangeClosed(1 ,30).forEach(i->{
			User user = new User();
			user.setUsername("user"+ i);
			user.setEmail("user"+ i +"@mail.com");
			user.setPassword("password");
			userRepo.save(user);
		});
	}
}
