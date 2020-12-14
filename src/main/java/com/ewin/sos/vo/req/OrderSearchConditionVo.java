package com.ewin.sos.vo.req;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class OrderSearchConditionVo implements Serializable {
  private static final long serialVersionUID = 1L;
  private LocalDateTime beginDate;
  private LocalDateTime endDate;
  private String orderNo;
  private String customer;
  private String status;
  private String createBy;
  private int pageSize;
  private int pageNum;


}
