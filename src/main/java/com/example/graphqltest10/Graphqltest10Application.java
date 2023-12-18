package com.example.graphqltest10;

import com.example.graphqltest10.dao.entities.Users;
import com.example.graphqltest10.dao.repoitories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Graphqltest10Application implements CommandLineRunner  {

	@Autowired
	UserRepo ur;

	public static void main(String[] args) {
		SpringApplication.run(Graphqltest10Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		ur.save(Users.builder().id(null).name("wda").email("s").date_Naissance("wda").build());
	}
}
