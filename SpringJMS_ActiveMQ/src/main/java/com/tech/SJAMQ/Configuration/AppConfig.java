package com.tech.SJAMQ.Configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "com.tech")
@Import({MessagingConfiguration.class})
public class AppConfig {

}
