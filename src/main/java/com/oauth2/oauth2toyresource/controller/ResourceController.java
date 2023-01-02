package com.oauth2.oauth2toyresource.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

  @GetMapping("/main")
  public String main() {
    return "success";
  }

}
