package com.cg.fda.service;

import java.util.List;

import com.cg.fda.exception.IDNotFoundException;
import com.cg.fda.domain.RestaurantDetails;
import com.cg.fda.domain.Order;

public interface AdminService {
	
	RestaurantDetails createRestaurantDetails(RestaurantDetails restaurantDetails);
	RestaurantDetails updateRestaurantDetailsById(Integer restaurantDetailsId, RestaurantDetails restaurantDetailsDetails) throws IDNotFoundException;
	boolean deleteRestaurantDetailsById(Integer restaurantDetailsId) throws IDNotFoundException;
	List<RestaurantDetails> getAllRestaurantDetails();
	
	Order createOrder(Order order);
    Order updateOrderById(Integer orderId, Order orderDetails) throws IDNotFoundException;
    boolean deleteOrderById(Integer orderId) throws IDNotFoundException;
	List<Order> getAllOrder();

}