package com.axonivy.market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MarketplaceServiceApplication {
  private String test;
  public static void main(String[] args) {
    SpringApplication.run(MarketplaceServiceApplication.class, args);
  }

}
