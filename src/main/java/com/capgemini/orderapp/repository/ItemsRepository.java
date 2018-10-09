package com.capgemini.orderapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.orderapp.entity.Items;

public interface ItemsRepository extends JpaRepository<Items, Integer> {

}
