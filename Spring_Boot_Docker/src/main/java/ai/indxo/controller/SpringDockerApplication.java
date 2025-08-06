package ai.indxo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringDockerApplication {

	@GetMapping("/docker")
	public static String dockerTest() {
		
		return "Spring Boot Application deployment on docker";
	}
	
	@GetMapping("/greet")
	public static String greeting() {
		return "Hello good morning";
	}
}
