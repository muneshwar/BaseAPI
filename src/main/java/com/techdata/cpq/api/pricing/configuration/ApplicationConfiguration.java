package com.techdata.cpq.api.pricing.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * 
 * @author CPQ Pricing Wrapper API Development
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.techdata.cpq.api.pricing")
@PropertySource("classpath:application.properties")
public class ApplicationConfiguration {
}