package com.ewin.sos.controller;

import com.ewin.sos.entity.Order;
import com.ewin.sos.exception.RecordNotFoundException;
import com.ewin.sos.service.OrderService;
import com.ewin.sos.util.JsonWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Map;

@RestController
@RequestMapping("/")
public class OrderController {

  private Logger logger = LoggerFactory.getLogger(OrderController.class);

  @Autowired
  private OrderService orderService;

  @GetMapping("/order")
  public Map listOrder() {
    return JsonWrapper.wrap(orderService.listOrder());

  }

  @GetMapping("/order/{id}")
  public Map getOrder(@PathVariable int id) {
    return JsonWrapper.wrap(orderService.getOrder(id));
  }

  @PostMapping("/order")
  public Map createOrder(@RequestBody Order order) {
    orderService.createOrder(order);
    return JsonWrapper.wrap(null);
  }

  @PutMapping("/order")
  public Map updateOrder(@RequestBody Order order) {
    try {
      orderService.updateOrder(order);
    } catch (RecordNotFoundException e) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND, "更新失败", e);
    }
    return JsonWrapper.wrap(null);
  }

}
