package com.aplikacija;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.aplikacija.product.ProductRepository;
import com.aplikacija.user.UserRepository;

@SpringBootApplication
public class HranaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HranaApplication.class, args);
	}

}
