package br.com.hexarc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class HexarcApplication {

	public static void main(String[] args) {
		SpringApplication.run(HexarcApplication.class, args);
	}

}
