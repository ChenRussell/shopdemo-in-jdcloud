package com.jd.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="s_order")
public class Order {
	@Id
	@Column(name="orderid")
	private int orderId;
	@Column(name="ordernum")
	private String orderNum;
	@Column(name="ordertime")
	private Date time;
	@Column(name="producttime")
	private String product;
	@Column(name="remark")
	private String remark;
	@Column(name="user_id")
	private int userId;
	
	public Order() {}
	
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
	
	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderNum=" + orderNum + ", time=" + time + ", product=" + product
				+ ", remark=" + remark + ", userId=" + userId + "]";
	}
	
	
}
