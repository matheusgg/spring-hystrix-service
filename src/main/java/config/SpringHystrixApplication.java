package config;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * When it opens, add the Hystrix stream for your service, like http://localhost:7980/hystrix.stream
 */
@SpringCloudApplication
public class SpringHystrixApplication {

	public static void main(final String[] args) {
		SpringApplication.run(SpringHystrixApplication.class, args);
	}
}
