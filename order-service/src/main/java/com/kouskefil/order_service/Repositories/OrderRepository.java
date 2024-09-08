package com.kouskefil.order_service.Repositories;

import com.kouskefil.order_service.Models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
