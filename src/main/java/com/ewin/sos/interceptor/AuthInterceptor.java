package com.ewin.sos.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.TimeUnit;

@Component
public class AuthInterceptor implements HandlerInterceptor {

  @Autowired
  StringRedisTemplate redisTemplate;

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    if (request.getMethod().equals("OPTIONS")) {
      return true;
    }
    String sessionId = request.getHeader("Authorization");
    boolean isAuthenticated = true;
    if (sessionId == null || "".equals(sessionId.trim())) {
      isAuthenticated = false;
    } else {
      Boolean hasKey = redisTemplate.hasKey(sessionId);
      if (hasKey != null && hasKey) {
        redisTemplate.expire(sessionId, 60 * 30, TimeUnit.SECONDS);
      } else {
        isAuthenticated = false;
      }
    }

    if (isAuthenticated) {
      return true;
    } else {
      throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "未登录或登陆已超时");
    }
  }

  @Override
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

  }

  @Override
  public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

  }
}
