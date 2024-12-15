package org.anonbnr.web_services.grpc.hotels.client.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
		"org.anonbnr.web_services.grpc.hotel.client.services",
		"org.anonbnr.web_services.grpc.hotel.client.cli"
})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
