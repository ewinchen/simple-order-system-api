package com.ewin.sos.controller;

import com.ewin.sos.util.ApiUtil;
import com.ewin.sos.vo.res.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    StringRedisTemplate redisTemplate;

    @PostMapping("/login")
    public ResponseVo<Map<String, Object>> login(@RequestBody Map<String, Object> body) {
        String username = body.get("username").toString();
        String password = body.get("password").toString();
        Map<String, Object> result = new HashMap<>();
        String sessionId = UUID.randomUUID().toString();
        redisTemplate.opsForValue().set(username + ":" + sessionId, username, 60, TimeUnit.SECONDS);
        result.put("sessionId", username + ":" + sessionId);
        result.put("username", username);
        result.put("password", password);
        return ApiUtil.success(result);

    }

    @GetMapping("/loginCheck")
    public ResponseVo<?> loginCheck(HttpServletRequest request) {
        Map<String, Object> result = new HashMap<>();
        String sessionId = request.getHeader("Authorization");
        if (sessionId == null) {
            result.put("isLogin", false);
            return ApiUtil.success(result);
        }

        Boolean hasKey = redisTemplate.hasKey(sessionId);
        if (hasKey != null && hasKey) {
            result.put("isLogin", true);
        } else {
            result.put("isLogin", false);
        }
        return ApiUtil.success(result);

    }
}
