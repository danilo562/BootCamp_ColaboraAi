package br.com.impacta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BeneficiarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeneficiarioApplication.class, args);
	}

}
