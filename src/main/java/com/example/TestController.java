package com.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by medivh on 2017. 2. 13..
 */
@Controller
@Slf4j
public class TestController {

  @GetMapping("/")
  public String init() {
    return "index";
  }

}
