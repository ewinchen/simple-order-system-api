package com.ewin.sos.controller;

import com.ewin.sos.entity.Order;
import com.ewin.sos.service.OrderService;
import com.ewin.sos.util.ApiUtil;
import com.ewin.sos.vo.req.OrderSearchConditionVo;
import com.ewin.sos.vo.res.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/listOrder")
    public ResponseVo<List<Order>> listOrder() {

        // 权限校验，参数校验
        // 1. 预知错误 a.用户错误 b.系统错误
        // 2. 未知错误
        return ApiUtil.success(orderService.listOrder());
    }


    @GetMapping("/getOrder/{id}")
    public ResponseVo<Order> getOrder(@PathVariable int id) {
        return ApiUtil.success(orderService.getOrder(id));
    }

    @PostMapping("/createOrder")
    public ResponseVo<Integer> createOrder(@RequestBody Order order) {
        return ApiUtil.success(orderService.createOrder(order));
    }

    @PostMapping("/updateOrder")
    public ResponseVo<Object> updateOrder(@RequestBody Order order) {
        orderService.updateOrder(order);
        return ApiUtil.success(null);
    }

    @PostMapping("/searchOrder")
    public ResponseVo<Map<String, Object>> searchOrder(@RequestBody OrderSearchConditionVo condition) {

        return ApiUtil.success(orderService.searchOrder(condition));
    }

}
