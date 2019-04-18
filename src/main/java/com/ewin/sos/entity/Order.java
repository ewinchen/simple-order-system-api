package com.ewin.sos.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Order implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.id
     *
     * @mbg.generated Thu Apr 18 16:17:47 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.order_no
     *
     * @mbg.generated Thu Apr 18 16:17:47 CST 2019
     */
    private String orderNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.create_date
     *
     * @mbg.generated Thu Apr 18 16:17:47 CST 2019
     */
    private LocalDateTime createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.customer
     *
     * @mbg.generated Thu Apr 18 16:17:47 CST 2019
     */
    private String customer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.create_by
     *
     * @mbg.generated Thu Apr 18 16:17:47 CST 2019
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.submit_by
     *
     * @mbg.generated Thu Apr 18 16:17:47 CST 2019
     */
    private String submitBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.status
     *
     * @mbg.generated Thu Apr 18 16:17:47 CST 2019
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.goods
     *
     * @mbg.generated Thu Apr 18 16:17:47 CST 2019
     */
    private String goods;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.quantity
     *
     * @mbg.generated Thu Apr 18 16:17:47 CST 2019
     */
    private BigDecimal quantity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.unit
     *
     * @mbg.generated Thu Apr 18 16:17:47 CST 2019
     */
    private String unit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table orders
     *
     * @mbg.generated Thu Apr 18 16:17:47 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.id
     *
     * @return the value of orders.id
     *
     * @mbg.generated Thu Apr 18 16:17:47 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.id
     *
     * @param id the value for orders.id
     *
     * @mbg.generated Thu Apr 18 16:17:47 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.order_no
     *
     * @return the value of orders.order_no
     *
     * @mbg.generated Thu Apr 18 16:17:47 CST 2019
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.order_no
     *
     * @param orderNo the value for orders.order_no
     *
     * @mbg.generated Thu Apr 18 16:17:47 CST 2019
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.create_date
     *
     * @return the value of orders.create_date
     *
     * @mbg.generated Thu Apr 18 16:17:47 CST 2019
     */
    public LocalDateTime getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.create_date
     *
     * @param createDate the value for orders.create_date
     *
     * @mbg.generated Thu Apr 18 16:17:47 CST 2019
     */
    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.customer
     *
     * @return the value of orders.customer
     *
     * @mbg.generated Thu Apr 18 16:17:47 CST 2019
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.customer
     *
     * @param customer the value for orders.customer
     *
     * @mbg.generated Thu Apr 18 16:17:47 CST 2019
     */
    public void setCustomer(String customer) {
        this.customer = customer == null ? null : customer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.create_by
     *
     * @return the value of orders.create_by
     *
     * @mbg.generated Thu Apr 18 16:17:47 CST 2019
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.create_by
     *
     * @param createBy the value for orders.create_by
     *
     * @mbg.generated Thu Apr 18 16:17:47 CST 2019
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.submit_by
     *
     * @return the value of orders.submit_by
     *
     * @mbg.generated Thu Apr 18 16:17:47 CST 2019
     */
    public String getSubmitBy() {
        return submitBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.submit_by
     *
     * @param submitBy the value for orders.submit_by
     *
     * @mbg.generated Thu Apr 18 16:17:47 CST 2019
     */
    public void setSubmitBy(String submitBy) {
        this.submitBy = submitBy == null ? null : submitBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.status
     *
     * @return the value of orders.status
     *
     * @mbg.generated Thu Apr 18 16:17:47 CST 2019
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.status
     *
     * @param status the value for orders.status
     *
     * @mbg.generated Thu Apr 18 16:17:47 CST 2019
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.goods
     *
     * @return the value of orders.goods
     *
     * @mbg.generated Thu Apr 18 16:17:47 CST 2019
     */
    public String getGoods() {
        return goods;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.goods
     *
     * @param goods the value for orders.goods
     *
     * @mbg.generated Thu Apr 18 16:17:47 CST 2019
     */
    public void setGoods(String goods) {
        this.goods = goods == null ? null : goods.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.quantity
     *
     * @return the value of orders.quantity
     *
     * @mbg.generated Thu Apr 18 16:17:47 CST 2019
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.quantity
     *
     * @param quantity the value for orders.quantity
     *
     * @mbg.generated Thu Apr 18 16:17:47 CST 2019
     */
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.unit
     *
     * @return the value of orders.unit
     *
     * @mbg.generated Thu Apr 18 16:17:47 CST 2019
     */
    public String getUnit() {
        return unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.unit
     *
     * @param unit the value for orders.unit
     *
     * @mbg.generated Thu Apr 18 16:17:47 CST 2019
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Thu Apr 18 16:17:47 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", createDate=").append(createDate);
        sb.append(", customer=").append(customer);
        sb.append(", createBy=").append(createBy);
        sb.append(", submitBy=").append(submitBy);
        sb.append(", status=").append(status);
        sb.append(", goods=").append(goods);
        sb.append(", quantity=").append(quantity);
        sb.append(", unit=").append(unit);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Thu Apr 18 16:17:47 CST 2019
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Order other = (Order) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderNo() == null ? other.getOrderNo() == null : this.getOrderNo().equals(other.getOrderNo()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getCustomer() == null ? other.getCustomer() == null : this.getCustomer().equals(other.getCustomer()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getSubmitBy() == null ? other.getSubmitBy() == null : this.getSubmitBy().equals(other.getSubmitBy()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getGoods() == null ? other.getGoods() == null : this.getGoods().equals(other.getGoods()))
            && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Thu Apr 18 16:17:47 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderNo() == null) ? 0 : getOrderNo().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getCustomer() == null) ? 0 : getCustomer().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getSubmitBy() == null) ? 0 : getSubmitBy().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getGoods() == null) ? 0 : getGoods().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        return result;
    }
}