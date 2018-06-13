package com.jd.service;

import com.jd.domain.Order;

import java.util.List;

/**
 * created by chenrui18,2018/6/13 at 20:40
 */
public interface OrderService {

    // find orders by userid
    public List<Order> findOrdersByUserId(int userId);

    // delete order by orderid
    public boolean deleteOrderByOrderId(int orderId);

    // add order
    public boolean addOrder(Order order);
}
