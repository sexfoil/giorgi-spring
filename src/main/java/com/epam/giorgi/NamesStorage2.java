package com.epam.giorgi;

import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class NamesStorage2 implements Storage {

  private Map<Integer, String> names = Map.of(
    1, "EPAM",
    2, "GOOGLE"
  );

  @Override
  public Map<Integer, String> getNamesStorage() {
    return names;
  }
}
