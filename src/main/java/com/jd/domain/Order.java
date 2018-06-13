package com.jd.domain;

import java.util.Date;

public class Order {
	private int orderId;
	private String orderNum;
	private Date time;
	private String produce;
	private String remark;
	private int userid;
	
	public Order(int orderId, String orderNum, Date time, String produce, String remark, int userid) {
		this.orderId = orderId;
		this.orderNum = orderNum;
		this.time = time;
		this.produce = produce;
		this.remark = remark;
		this.userid = userid;
	}
	
	public Order(String orderNum, Date time, String produce, String remark, int userid) {
		this.orderNum = orderNum;
		this.time = time;
		this.produce = produce;
		this.remark = remark;
		this.userid = userid;
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
	public String getProduce() {
		return produce;
	}
	public void setProduce(String produce) {
		this.produce = produce;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
}
