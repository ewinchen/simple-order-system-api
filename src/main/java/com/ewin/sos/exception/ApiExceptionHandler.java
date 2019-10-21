package com.ewin.sos.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {

  @ExceptionHandler
  protected ResponseEntity<Map<String, Object>> handleServerException(RuntimeException e) {
    HttpStatus httpStatus;

    Map<String, Object> res = new HashMap<>();
    res.put("success", false);
    if (e instanceof ResponseStatusException) {
      httpStatus = ((ResponseStatusException) e).getStatus();
      res.put("message", ((ResponseStatusException) e).getReason());
    } else {
      e.printStackTrace();
      httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
      res.put("message", e.getMessage());
    }


    return new ResponseEntity<>(res, new HttpHeaders(), httpStatus);

  }

  @Override
  protected ResponseEntity<Object> handleExceptionInternal(Exception ex, @Nullable Object body, HttpHeaders headers, HttpStatus status, WebRequest request) {
    if (HttpStatus.INTERNAL_SERVER_ERROR.equals(status)) {
      request.setAttribute("javax.servlet.error.exception", ex, 0);
    }
    Map<String, Object> res = new HashMap<>();
    res.put("success", false);
    res.put("message", ex.getMessage());
    return new ResponseEntity<>(res, headers, status);

  }

}
