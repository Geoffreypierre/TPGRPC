package org.anonbnr.web_services.grpc.employees.server.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//EntityScan annotation to specify the package containing JPA entities
@EntityScan(basePackages = {
		"org.anonbnr.web_services.grpc.employees.server.model"
})
//EnableJpaRepositories annotation to specify the package for JPA repositories
@EnableJpaRepositories(basePackages = {
		"org.anonbnr.web_services.grpc.employees.server.repository"
})
@SpringBootApplication(scanBasePackages = {
		"org.anonbnr.web_services.grpc.employees.server.services",
		"org.anonbnr.web_services.grpc.employees.server.data",
})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}