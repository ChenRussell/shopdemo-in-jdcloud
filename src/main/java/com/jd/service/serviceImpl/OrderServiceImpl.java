package com.jd.service.serviceImpl;

import com.jd.domain.Order;
import com.jd.mapper.OrderMapper;
import com.jd.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created by chenrui18,2018/6/13 at 20:42
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMapper orderMapper;

    @Override
    public List<Order> findOrdersByUserId(int userId) {
        return orderMapper.queryByUserId(userId);
    }

    @Override
    public boolean deleteOrderByOrderId(int orderId) {
        return orderMapper.delete();
    }

    @Override
    public boolean addOrder(Order order) {
        return orderMapper.add(order);
    }
}
