package ai.indxo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootRestController {

	@GetMapping("/greet")
	public static String greeting() {
		return "Good morning my frieds this is Manish";
	}
	@GetMapping("/jenkins")
	public static String message() {
		return "Jenkins is a best tool for automate our application";
	}
}
