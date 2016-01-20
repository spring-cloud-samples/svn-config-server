package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  private static final String template = "Hello, %s!";

  @Value("${foo:World}")
  private String name;

  @RequestMapping("/")
  public String home() {
    return String.format(template, name);
  }

}
