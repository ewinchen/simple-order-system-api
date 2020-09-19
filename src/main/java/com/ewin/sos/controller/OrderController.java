package com.ewin.sos.controller;

import com.ewin.sos.entity.Order;
import com.ewin.sos.service.OrderService;
import com.ewin.sos.util.ApiUtil;
import com.ewin.sos.util.JsonWrapper;
import com.ewin.sos.vo.OrderSearchConditionVo;
import com.ewin.sos.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/order")
    public ResponseVo<List<Order>> listOrder() {

        // 权限校验，参数校验
        // 1. 预知错误 a.用户错误 b.系统错误
        // 2. 未知错误
        return ApiUtil.successVo(orderService.listOrder());
    }


    @GetMapping("/order/{id}")
    public ResponseVo<Order> getOrder(@PathVariable int id) {
        return ApiUtil.successVo(orderService.getOrder(id));
    }

    @PostMapping("/order")
    public Map<String, Object> createOrder(@RequestBody Order order) {
        return JsonWrapper.wrap(orderService.createOrder(order));
    }

    @PutMapping("/order")
    public Map<String, Object> updateOrder(@RequestBody Order order) {
        orderService.updateOrder(order);
        return JsonWrapper.wrap(null);
    }

    @PostMapping("/order-search")
    public Map<String, Object> searchOrder(@RequestBody OrderSearchConditionVo condition) {

        return JsonWrapper.wrap(orderService.searchOrder(condition));
    }

}
