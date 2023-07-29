package com.sample.observability.micrometerprometheusgrafana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MicrometerPrometheusGrafanaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrometerPrometheusGrafanaApplication.class, args);
	}

}
