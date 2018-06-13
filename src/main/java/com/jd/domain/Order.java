package com.jd.domain;

import java.util.Date;

public class Order {
	private int orderId;
	private String orderNum;
	private Date time;
	private String product;
	private String remark;
	private int userId;
	
	public Order(int orderId, String orderNum, Date time, String product, String remark, int userId) {
		this.orderId = orderId;
		this.orderNum = orderNum;
		this.time = time;
		this.product = product;
		this.remark = remark;
		this.userId = userId;
	}
	
	public Order(String orderNum, Date time, String product, String remark, int userId) {
		this.orderNum = orderNum;
		this.time = time;
		this.product = product;
		this.remark = remark;
		this.userId = userId;
	}
	
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getProduct() {
		return product;
	}
	public void setProduce(String produce) {
		this.product = produce;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserid(int userId) {
		this.userId = userId;
	}
}
