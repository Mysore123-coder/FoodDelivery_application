package com.cg.fda.repository;

import org.springframework.data.repository.CrudRepository;

import com.cg.fda.domain.RestaurantDetails;

public interface RestaurantDetailsRepository extends CrudRepository<RestaurantDetails, Integer>{
	
}
