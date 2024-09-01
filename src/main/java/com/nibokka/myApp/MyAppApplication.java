package com.nibokka.myApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {
		ApplicationContext app = SpringApplication.run(MyAppApplication.class, args);

		Dev dev = app.getBean(Dev.class);
		dev.build();


	}

}
