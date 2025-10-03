package br.edu.infnet.robsoncnpjapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RobsoncnpjapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RobsoncnpjapiApplication.class, args);
	}

}
