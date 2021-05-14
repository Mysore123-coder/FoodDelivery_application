package com.cg.fda.repository;

import org.springframework.data.repository.CrudRepository;

import com.cg.fda.domain.Order;

public interface OrderRepository extends CrudRepository<Order, Integer>{

}