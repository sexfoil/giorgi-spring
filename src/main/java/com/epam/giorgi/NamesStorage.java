package com.epam.giorgi;

import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class NamesStorage implements Storage {

  private Map<Integer, String> names = Map.of(
    1, "Giorgi",
    2, "Slava"
  );

  @Override
  public Map<Integer, String> getNamesStorage() {
    return names;
  }
}
