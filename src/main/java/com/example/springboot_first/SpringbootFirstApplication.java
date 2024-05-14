package com.example.springboot_first;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootFirstApplication {

	public static void main(String[] args) {
		ApplicationContext cont=SpringApplication.run(SpringbootFirstApplication.class, args);

		Laptops obj=cont.getBean(Laptops.class);

		obj.exec();
	}

}
