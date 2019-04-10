package com.ewin.sos.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class DefaultController {

  private Logger logger = LoggerFactory.getLogger(DefaultController.class);


  @GetMapping("/array-list")
  public List<String> list() {

    List<String> res = new ArrayList<>();
    res.add("1");
    res.add("2");
    res.add("3");
    res.add("4");
    res.add("5");
    return res;
  }

  @GetMapping("/hash-map")
  public Map<Object, Object> map() {
    Map<Object, Object> res = new HashMap<>();
    res.put(1, 1);
    res.put("2", 3);
    res.put("name", "Edwin");
    return res;
  }

  @GetMapping("error")
  public Map<Object, Object> error() {
    throw new ResponseStatusException(HttpStatus.NOT_FOUND, "更新失败");
  }
}
