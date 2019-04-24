package com.ewin.sos.dto;

import java.time.LocalDateTime;

public class OrderSearchConditionDto {
  private LocalDateTime beginDate;
  private LocalDateTime endDate;
  private String orderNo;
  private String customer;
  private String status;
  private String createBy;
  private int pageSize;
  private int pageNum;

  public LocalDateTime getBeginDate() {
    return beginDate;
  }

  public void setBeginDate(LocalDateTime beginDate) {
    this.beginDate = beginDate;
  }

  public LocalDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDateTime endDate) {
    this.endDate = endDate;
  }

  public String getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }

  public String getCustomer() {
    return customer;
  }

  public void setCustomer(String customer) {
    this.customer = customer;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getCreateBy() {
    return createBy;
  }

  public void setCreateBy(String createBy) {
    this.createBy = createBy;
  }

  public int getPageSize() {
    return pageSize;
  }

  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
  }

  public int getPageNum() {
    return pageNum;
  }

  public void setPageNum(int pageNum) {
    this.pageNum = pageNum;
  }
}
