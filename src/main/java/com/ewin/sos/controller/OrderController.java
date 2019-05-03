package com.ewin.sos.controller;

import com.ewin.sos.dto.OrderSearchConditionDto;
import com.ewin.sos.entity.Order;
import com.ewin.sos.exception.RecordNotFoundException;
import com.ewin.sos.service.OrderService;
import com.ewin.sos.util.JsonWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Map;

@RestController
@RequestMapping("/")
public class OrderController {

  @Autowired
  private OrderService orderService;

  @GetMapping("/order")
  public Map<String, Object> listOrder() {
    return JsonWrapper.wrap(orderService.listOrder());

  }

  @GetMapping("/order/{id}")
  public Map<String, Object> getOrder(@PathVariable int id) {
    return JsonWrapper.wrap(orderService.getOrder(id));
  }

  @PostMapping("/order")
  public Map<String, Object> createOrder(@RequestBody Order order) {
    return JsonWrapper.wrap(orderService.createOrder(order));
  }

  @PutMapping("/order")
  public Map<String, Object> updateOrder(@RequestBody Order order) {
    try {
      orderService.updateOrder(order);
    } catch (RecordNotFoundException e) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND, "更新失败", e);
    }
    return JsonWrapper.wrap(null);
  }

  @PostMapping("/order-search")
  public Map<String, Object> searchOrder(@RequestBody OrderSearchConditionDto condition) {

    return JsonWrapper.wrap(orderService.searchOrder(condition));
  }

}
