package com.divya.activemq.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.divya.activemq.model.MessageStorage;

@Configuration
public class BeanConfiguration {

  @Bean
  public MessageStorage customerStorage() {
    return new MessageStorage();
  }
}