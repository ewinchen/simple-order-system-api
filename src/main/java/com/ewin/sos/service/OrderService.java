package com.ewin.sos.service;

import com.ewin.sos.enums.ErrorCodeEnum;
import com.ewin.sos.exception.CustomException;
import com.ewin.sos.vo.OrderSearchConditionVo;
import com.ewin.sos.entity.Order;
import com.ewin.sos.entity.OrderExample;
import com.ewin.sos.exception.NotFoundException;
import com.ewin.sos.mapper.OrderMapper;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class OrderService {

  @Autowired
  private OrderMapper orderMapper;

  public List<Order> listOrder() {
    OrderExample orderExample = new OrderExample();
    orderExample.setOrderByClause("order_no desc");
    return orderMapper.selectByExample(orderExample);
  }

  public Order getOrder(int id) {
    return Optional.ofNullable(orderMapper.selectByPrimaryKey(id)).orElseThrow(() -> new NotFoundException("订单不存在"));
  }

  public void updateOrder(Order order) {
    if (orderMapper.selectByPrimaryKey(order.getId()) == null) {
      throw new NotFoundException();
    }
    orderMapper.updateByPrimaryKeySelective(order);

  }

  public int createOrder(Order order) {
    orderMapper.insertSelective(order);
    return order.getId();
  }

  public Map<String, Object> searchOrder(OrderSearchConditionVo condition) {
    // 初始化参数
    LocalDateTime beginDate = condition.getBeginDate() != null ? condition.getBeginDate() : LocalDateTime.parse("1000-01-01T00:00:00");
    LocalDateTime endDate = condition.getEndDate() != null ? condition.getEndDate() : LocalDateTime.parse("9999-12-31T23:59:59");

    int pageSize = condition.getPageSize() != 0 ? condition.getPageSize() : 15;
    int pageNum = condition.getPageNum() != 0 ? condition.getPageNum() : 1;

    OrderExample example = new OrderExample();
    example.setOrderByClause("order_no desc");
    OrderExample.Criteria criteria = example.createCriteria();
    criteria.andCreateDateBetween(beginDate, endDate);

    if (condition.getOrderNo() != null) criteria.andOrderNoLikeInsensitive(condition.getOrderNo());
    if (condition.getCustomer() != null) criteria.andCustomerLikeInsensitive(condition.getCustomer());
    if (condition.getCreateBy() != null) criteria.andCreateByLikeInsensitive(condition.getCreateBy());
    if (condition.getStatus() != null) criteria.andStatusLikeInsensitive(condition.getStatus());

    RowBounds rowBounds = new RowBounds((pageNum - 1) * pageSize, pageSize);

    Map<String, Object> result = new HashMap<>();
    result.put("total", orderMapper.countByExample(example));
    result.put("recordset", orderMapper.selectByExampleWithRowbounds(example, rowBounds));
    result.put("pageSize", pageSize);
    result.put("pageNum", pageNum);

    return result;

  }

}
