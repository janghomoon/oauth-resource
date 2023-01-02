package com.oauth2.oauth2toyresource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableResourceServer // 리소스 서버임을 정의
@SpringBootApplication
public class Oauth2ToyResourceApplication {

  public static void main(String[] args) {
    SpringApplication.run(Oauth2ToyResourceApplication.class, args);
  }

}
