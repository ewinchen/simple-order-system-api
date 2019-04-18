package com.ewin.sos.service;

import com.ewin.sos.entity.Order;
import com.ewin.sos.entity.OrderExample;
import com.ewin.sos.exception.RecordNotFoundException;
import com.ewin.sos.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Service
public class OrderService {

  @Autowired
  private OrderMapper orderMapper;

  public List<Order> listOrder() {
    OrderExample orderExample = new OrderExample();
    orderExample.setOrderByClause("order_no");
    return orderMapper.selectByExample(orderExample);
  }

  public Order getOrder(int id) {
    return orderMapper.selectByPrimaryKey(id);
  }

  public void updateOrder(Order order) throws RecordNotFoundException {
    if (orderMapper.selectByPrimaryKey(order.getId()) == null) {
      throw new RecordNotFoundException();
    }
    orderMapper.updateByPrimaryKeySelective(order);

  }

  public void createOrder(Order order) {
    orderMapper.insertSelective(order);
  }

}
