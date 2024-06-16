package com.code.kubernetesdemo.repository;

import com.code.kubernetesdemo.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
