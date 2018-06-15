package com.jd.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "s_order")
public class Order extends BaseBean {
	@Id
	@Column(name = "orderid")
	private int orderId;
	@Column(name = "ordernum")
	private String orderNum;
	@Column(name = "ordertime")
	private String time;
	@Column(name = "producttime")
	private String product;
	@Column(name = "remark")
	private String remark;
	@Column(name = "user_id")
	private int userId;

	public Order() {
	}

	public Order(int orderId, String orderNum, String time, String product,
			String remark, int userId) {
		this.orderId = orderId;
		this.orderNum = orderNum;
		this.time = time;
		this.product = product;
		this.remark = remark;
		this.userId = userId;
	}

	public Order(String orderNum, String time, String product, String remark,
			int userId) {
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

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
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
		return "Order [orderId=" + orderId + ", orderNum=" + orderNum
				+ ", time=" + time + ", product=" + product + ", remark="
				+ remark + ", userId=" + userId + "]";
	}

}
