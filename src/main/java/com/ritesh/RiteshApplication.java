package com.ritesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class RiteshApplication {

	public static void main(String[] args) {
		SpringApplication.run(RiteshApplication.class, args);
	}

}
