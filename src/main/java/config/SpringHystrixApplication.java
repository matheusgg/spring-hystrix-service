package config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.ribbon.SpringClientFactory;
import org.springframework.context.annotation.Bean;

/**
 * When it opens, add the Hystrix stream for your service, like http://localhost:7980/hystrix.stream
 */
@SpringBootApplication
@EnableCircuitBreaker
@EnableHystrixDashboard
@EnableEurekaClient
public class SpringHystrixApplication {

	public static void main(final String[] args) {
		SpringApplication.run(SpringHystrixApplication.class, args);
	}

	@Bean
	public SpringClientFactory springClientFactory() {
		return new SpringClientFactory();
	}

}
