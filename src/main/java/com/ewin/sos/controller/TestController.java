package com.ewin.sos.controller;

import com.ewin.sos.util.ApiUtil;
import com.ewin.sos.vo.res.ResponseVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Map;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @PostMapping("testParam")
    public ResponseVo<?> testParam(@RequestBody Map<String, Object> body) {
        ArrayList<String> arr = (ArrayList<String>) body.get("arr");
        for(String item: arr) {
            System.out.println(item);
        }
        return ApiUtil.success(arr);

    }
}
