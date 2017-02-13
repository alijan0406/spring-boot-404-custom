package com.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

/**
 * Created by medivh on 2017. 2. 13..
 */
@ControllerAdvice
@Slf4j
public class ExceptionHandling {

  @ExceptionHandler(NoHandlerFoundException.class)
  public ModelAndView error404() {
    ModelAndView mav = new ModelAndView("error");
    mav.addObject("test", "테스트");

    log.info("404 발생");
    return mav;
  }
}
