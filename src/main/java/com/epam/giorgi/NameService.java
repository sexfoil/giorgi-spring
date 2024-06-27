package com.epam.giorgi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Configuration
@Component
public class NameService {

  @Autowired
  @Qualifier("storage2")
  private Storage storage;

  public String getNameGiorgi(int id) {
    return storage.getNamesStorage().get(id);
  }
}
