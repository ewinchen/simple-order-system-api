package com.ewin.sos.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice(basePackages = "com.ewin.sos.controller")
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {

  @ExceptionHandler
  protected ResponseEntity<Map> handleServerException(RuntimeException e) {
    HttpStatus httpStatus;

    if (e instanceof ResponseStatusException) {
      httpStatus = ((ResponseStatusException) e).getStatus();
    } else {
      e.printStackTrace();
      httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
    }

    Map<String, Object> res = new HashMap<>();
    res.put("success", false);
    res.put("message", e.getMessage());
    return new ResponseEntity<>(res, new HttpHeaders(), httpStatus);

  }
}
