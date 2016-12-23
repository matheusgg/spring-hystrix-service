package config;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import config.model.UserRequest;

@RestController
public class HystrixServiceController {

	@RequestMapping("/generateMessage")
	public String home() {
		return "Hello!";
	}

	@RequestMapping(value = "/simulate")
	public String simulate() {
		throw new RuntimeException("HystrixServiceController Simulation Exception");
	}

	@RequestMapping(value = "/user", method = POST)
	public String user(@RequestBody final UserRequest user) {
		return user.toString();
	}

}