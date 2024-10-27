package org.sesac.market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CoreDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreDiscoveryApplication.class, args);
	}

}
