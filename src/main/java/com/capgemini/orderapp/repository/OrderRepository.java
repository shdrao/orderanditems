package com.capgemini.orderapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.orderapp.entity.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Integer> {

}
