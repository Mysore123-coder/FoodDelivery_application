package com.cg.fda.service;

import static org.assertj.core.api.Assertions.assertThat;


import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.fda.domain.RestaurantDetails;
import com.cg.fda.domain.Order;
import com.cg.fda.repository.RestaurantDetailsRepository;
import com.cg.fda.repository.OrderRepository;
import com.cg.fda.service.AdminService;

/**
 * The AdminServiceTest class provides testing of AdminService layer
 * 
 * @author Amrutha R
 * 
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminServiceImplTest {

	@MockBean
	private RestaurantDetailsRepository restaurantdetailsRepository;

	@MockBean
	private OrderRepository orderRepository;

	@Autowired
	private AdminService adminService;

	@Test
	public void testCreateRestaurantDetails() throws Exception {
		RestaurantDetails restaurantdetails = new RestaurantDetails(106, "Janani", "janani", "8512518301", "Mysore", "pizza", "100", "01", "Amrutha", "8521479637");
		Mockito.when(restaurantdetailsRepository.save(restaurantdetails)).thenReturn(restaurantdetails);
		assertThat(adminService.createRestaurantDetails(restaurantdetails)).isEqualTo(restaurantdetails);
	}

	@Test
	public void testDeleteRestaurantDetailsById() throws Exception {
		RestaurantDetails restaurantdetails = new RestaurantDetails(101, "Janani", "janani", "8512518301", "Mysore", "pizza", "100", "01", "Amrutha", "8521479637");
		restaurantdetailsRepository.deleteById(restaurantdetails.getRestaurantDetailsId());
		System.out.println(restaurantdetailsRepository.findById(101));
		Assert.assertTrue(restaurantdetailsRepository.findById(101).isEmpty());
	}

	@Test
	public void testUpdateRestaurantDetailsById() throws Exception {
		RestaurantDetails restaurantdetails = new RestaurantDetails(101, "Janani", "janani", "8512518301", "Mysore", "pizza", "100", "01", "Amrutha", "8521479637");
		Mockito.when(restaurantdetailsRepository.save(restaurantdetails)).thenReturn(restaurantdetails);
		restaurantdetails.setRestaurantOwnerName("Nivya");
		restaurantdetails.setRestaurantName("Nivya");
		restaurantdetails.setRestaurantPhone("8521479637");
		restaurantdetails.setRestaurantAddress("Karnataka");
		restaurantdetails.setRestaurantFoodItems("pizza");
		restaurantdetails.setFoodItemsPrice("100");
		restaurantdetails.setDeliveryBoyId("2");
		restaurantdetails.setDeliveryBoyName("Amrutha");
		restaurantdetails.setDeliveryBoyPhone("285214796");
		System.out.println(restaurantdetails.getRestaurantOwnerName());
		System.out.println(restaurantdetails.getRestaurantName());
		System.out.println(restaurantdetails.getRestaurantPhone());
		System.out.println(restaurantdetails.getRestaurantAddress());
		System.out.println(restaurantdetails.getRestaurantFoodItems());
		System.out.println(restaurantdetails.getFoodItemsPrice());
		System.out.println(restaurantdetails.getDeliveryBoyId());
		System.out.println(restaurantdetails.getDeliveryBoyName());
		System.out.println(restaurantdetails.getDeliveryBoyPhone());
		Assert.assertTrue((restaurantdetailsRepository.findById(101).isEmpty()));
	}

	@Test
	public void testGetAllRestaurantDetails() throws Exception {
		RestaurantDetails restaurantdetails1 = new RestaurantDetails(106, "Janani", "janani", "8512518301", "Mysore", "pizza", "100", "01", "Amrutha", "8521479637");
		RestaurantDetails restaurantdetails2 = new RestaurantDetails(102, "Janani", "janani", "8512518301", "Mysore", "pizza", "100", "01", "Amrutha", "8521479637");
		List<RestaurantDetails> restaurantdetailslist = new ArrayList<>();
		restaurantdetailslist.add(restaurantdetails1);
		restaurantdetailslist.add(restaurantdetails2);

		Mockito.when(restaurantdetailsRepository.findAll()).thenReturn(restaurantdetailslist);
		assertThat(adminService.getAllRestaurantDetails()).isEqualTo(restaurantdetailslist);

	}

	@Test
	public void testCreateOrder() throws Exception {
		Order order = new Order(3, "shivani", "9550355319", "shivani@gmail.com", "125/B");
		Mockito.when(orderRepository.save(order)).thenReturn(order);
		assertThat(adminService.createOrder(order)).isEqualTo(order);
	}

	@Test
	public void testUpdateOrderById() throws Exception {
		Order order = new Order(3, "shivani", "9550355319", "shivani@gmail.com", "125/B");
		Mockito.when(orderRepository.save(order)).thenReturn(order);

		order.setUserName("shivani.s@gmail.com");
		Mockito.when(orderRepository.save(order)).thenReturn(order);
		System.out.println(order.getUserName());

		Assert.assertTrue(orderRepository.findById(3).isEmpty());

	}

	@Test
	public void testDeleteOrderById() throws Exception {

		Order order = new Order(3, "shivani", "9550355319", "shivani@gmail.com", "125/B");
		orderRepository.deleteById(order.getOrderId());
		System.out.println(orderRepository.findById(3));
		Assert.assertTrue(orderRepository.findById(3).isEmpty());
	}

	@Test
	public void testGetAllOrder() throws Exception {
		Order order1 = new Order(3, "shivani", "9550355319", "shivani@gmail.com", "125/B");
		Order order2 = new Order(1, "shivani", "9550355319", "shivani@gmail.com", "125/B");
		List<Order> orderlist = new ArrayList<>();
		orderlist.add(order1);
		orderlist.add(order2);

		Mockito.when(orderRepository.findAll()).thenReturn(orderlist);
		assertThat(adminService.getAllOrder()).isEqualTo(orderlist);
	}
}
