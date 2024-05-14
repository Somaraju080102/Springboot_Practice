package com.example.springboot_first;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootFirstApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext cont=SpringApplication.run(SpringbootFirstApplication.class, args);

		LaptopsService service=cont.getBean(LaptopsService.class);

		Laptops lap=cont.getBean(Laptops.class);	

		service.addLaptops(lap);
	}

}
