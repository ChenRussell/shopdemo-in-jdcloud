package com.jd.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.jd.domain.Order;

public interface OrderDao extends JpaRepository<Order, Integer>{
	@Query(value="select * from s_order where user_id = ?1",nativeQuery=true)
	public List<Order> queryByUserId(int userId);
	
}
