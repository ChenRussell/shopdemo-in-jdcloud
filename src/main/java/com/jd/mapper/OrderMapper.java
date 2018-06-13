package com.jd.mapper;

import java.util.List;

import com.jd.domain.Order;

public interface OrderMapper {
	public boolean add(Order order);
	//不提供实现
	public boolean update(int orderId);
	public boolean delete();
	public List<Order> queryAll();
	public List<Order> queryByUserId(int userId);
	public Order queryByOrderId(int orderId);
}
