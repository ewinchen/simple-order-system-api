package com.ewin.sos.controller;

import com.ewin.sos.util.JsonWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.servlet.http.HttpServletRequest;
import java.util.*;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/api")
public class DefaultController {

  private Logger logger = LoggerFactory.getLogger(DefaultController.class);

  @Autowired
  StringRedisTemplate redisTemplate;


  @GetMapping("/array-list")
  public List<String> list() {

    List<String> res = new ArrayList<>();
    res.add("1");
    res.add("2");
    res.add("3");
    res.add("4");
    res.add("5");
    logger.info(res.toString());
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

  @PostMapping("/login")
  public Map<String, Object> login(@RequestBody Map<String, Object> body) {
    String username = body.get("username").toString();
    String password = body.get("password").toString();
    Map<String, Object> result = new HashMap<>();
    String sessionId = UUID.randomUUID().toString();
    redisTemplate.opsForValue().set(username + ":" + sessionId, username, 60, TimeUnit.SECONDS);
    result.put("sessionId", username + ":" + sessionId);
    result.put("username", username);
    result.put("password", password);
    return JsonWrapper.wrap(result);
  }

  @GetMapping("/login-check")
  public Map<String, Object> loginCheck(HttpServletRequest request) {
    Map<String, Object> result = new HashMap<>();
    String sessionId = request.getHeader("Authorization");
    if (sessionId == null) {
      result.put("success", false);
      return result;
    }

    Boolean hasKey = redisTemplate.hasKey(sessionId);
    if (hasKey != null && hasKey) {
      result.put("success", true);
    } else {
      result.put("success", false);
    }
    return result;

  }
}
