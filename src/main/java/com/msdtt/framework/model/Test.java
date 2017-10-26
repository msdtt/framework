package com.msdtt.framework.model;

import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Test implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.months
     * 
     */
    private Integer months;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.order_no
     * 
     */
    private String orderNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.position
     * 
     */
    private Integer position;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.expired_at
     * 
     */
    private Integer expiredAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.amount
     * 
     */
    private BigDecimal amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.repay_at
     * 
     */
    private Integer repayAt;

    /**
     * test表的操作属性:serialVersionUID
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 数据字段 test.months的get方法 
     * 
     */
    public Integer getMonths() {
        return months;
    }

    /**
     * 数据字段 test.months的set方法
     * 
     */
    public void setMonths(Integer months) {
        this.months = months;
    }

    /**
     * 数据字段 test.order_no的get方法 
     * 
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 数据字段 test.order_no的set方法
     * 
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * 数据字段 test.position的get方法 
     * 
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * 数据字段 test.position的set方法
     * 
     */
    public void setPosition(Integer position) {
        this.position = position;
    }

    /**
     * 数据字段 test.expired_at的get方法 
     * 
     */
    public Integer getExpiredAt() {
        return expiredAt;
    }

    /**
     * 数据字段 test.expired_at的set方法
     * 
     */
    public void setExpiredAt(Integer expiredAt) {
        this.expiredAt = expiredAt;
    }

    /**
     * 数据字段 test.amount的get方法 
     * 
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 数据字段 test.amount的set方法
     * 
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 数据字段 test.repay_at的get方法 
     * 
     */
    public Integer getRepayAt() {
        return repayAt;
    }

    /**
     * 数据字段 test.repay_at的set方法
     * 
     */
    public void setRepayAt(Integer repayAt) {
        this.repayAt = repayAt;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}