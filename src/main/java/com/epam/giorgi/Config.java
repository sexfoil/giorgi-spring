package com.epam.giorgi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

  @Bean("storage1")
  public Storage getStorage1() {
    return new NamesStorage();
  }

  @Bean("storage2")
  public Storage getStorage2() {
    return new NamesStorage2();
  }

}
