package com.tech.SJAMQ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.tech.SJAMQ.Configuration.AppConfig;

@SpringBootApplication
@Import({AppConfig.class})
public class SpringJmsActiveMqApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJmsActiveMqApplication.class, args);
	}

}
