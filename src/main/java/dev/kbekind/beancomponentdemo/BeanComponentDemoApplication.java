package dev.kbekind.beancomponentdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BeanComponentDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanComponentDemoApplication.class, args);
	}



	// A @Bean can be included in the application file.
	// This will work because of the @Bean annotation
	// CommandLineRunner is a useful way to use this
	@Bean
	CommandLineRunner commandLineRunner() {
		return args -> {
			System.out.println("We can print like this.");
		};
	}

}
