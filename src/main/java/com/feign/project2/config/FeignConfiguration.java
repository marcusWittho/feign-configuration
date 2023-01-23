package com.feign.project2.config;

import feign.Logger;
import feign.Logger.Level;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfiguration {

  @Bean
  Logger.Level feignLoggerLevel() {
    return Level.BASIC;
  }
}
