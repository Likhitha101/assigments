// OrderRepository.java
package com.example.project2.Repositories;

import com.example.project2.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.example.project2.entities.*;

	public interface OrderRepo extends JpaRepository<Order, Long> {
	    List<Order> findByStatus(OrderStatus status);
	}
