package com.jd.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import com.jd.domain.Order;

public interface OrderDao extends JpaRepository<Order, Integer>{
	@Query(value="select * from s_order where user_id = ?1",nativeQuery=true)
	public List<Order> queryByUserId(int userId);
	
	@Transactional
	@Modifying
	@Query(value="delete from s_order where orderid=?1",nativeQuery=true)
	public int deleteByOrderId(int orderId);
	
	@Transactional
	@Modifying
	@Query(value="delete from s_order where user_id=?1",nativeQuery=true)
	public int deleteByUserId(int userId);
	
	
}
