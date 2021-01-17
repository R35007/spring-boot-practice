package com.springboot.practice.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloController {

  @GetMapping(value = "/hi")
  public String sayHi(@RequestParam String name) {
    return "Hi ! " + name;
  }

}
