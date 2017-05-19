package br.com.goldcalled.GoldCalled;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication
public class GoldCalledApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {

		SpringApplication.run(GoldCalledApplication.class, args);

	}
}
