package com.epam.giorgi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/giorgi/app")
public class HelloController {

  @Autowired
  private NameService service;

  @GetMapping
  public String hello() {
    return "Hello World";
  }

  @GetMapping("/name/{id}")
  public String sayHelloName(@PathVariable int id) {

    return String.format("Hello %s", service.getNameGiorgi(id));
  }


}
