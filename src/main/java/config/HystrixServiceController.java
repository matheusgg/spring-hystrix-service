package config;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixServiceController {

	@RequestMapping("/")
	public String home() {
		return "Hello!";
	}

}