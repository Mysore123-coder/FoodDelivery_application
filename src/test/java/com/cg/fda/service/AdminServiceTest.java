package com.cg.fda.service;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.fda.domain.Order;
import com.cg.fda.domain.RestaurantDetails;
import com.cg.fda.exception.IDNotFoundException;
import com.cg.fda.repository.OrderRepository;
import com.cg.fda.repository.RestaurantDetailsRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminServiceTest {
    @Autowired
    private AdminService adminService;
    @MockBean
    private OrderRepository orderRepository;
    @MockBean
    private RestaurantDetailsRepository restaurantdetailsRepository;
    
    @Test
    void createRestaurantDetails() {
        RestaurantDetails restaurantdetails=new RestaurantDetails();
        restaurantdetails.setRestaurantDetailsId(1);
        restaurantdetails.setRestaurantOwnerName("Sandhya");
        restaurantdetails.setRestaurantName("Oyster Bay");
        restaurantdetails.setRestaurantPhone("9876543212");
        restaurantdetails.setRestaurantAddress("Tirupathi");
        restaurantdetails.setDeliveryBoyId("1");
        restaurantdetails.setDeliveryBoyName("Tom");
        restaurantdetails.setDeliveryBoyPhone("8976542315");
               Mockito.when(restaurantdetailsRepository.save(restaurantdetails)).thenReturn(restaurantdetails);
        assertThat(adminService.createRestaurantDetails(restaurantdetails)).isEqualTo(restaurantdetails);
            
        }
    @Test
    void deleteRestaurantDetailsTest() throws IDNotFoundException {
    	RestaurantDetails restaurantdetails=new RestaurantDetails();
    	restaurantdetails.setRestaurantDetailsId(1);
        restaurantdetails.setRestaurantOwnerName("Sandhya");
        restaurantdetails.setRestaurantName("Oyster Bay");
        restaurantdetails.setRestaurantPhone("9876543212");
        restaurantdetails.setRestaurantAddress("Tirupathi");
        restaurantdetails.setDeliveryBoyId("1");
        restaurantdetails.setDeliveryBoyName("Tom");
        restaurantdetails.setDeliveryBoyPhone("8976542315");
        int restaurantDetailsId=restaurantdetails.getRestaurantDetailsId();
        Assert.assertTrue(restaurantdetailsRepository.findById(1).isEmpty());                     
    }    
    @Test
    void getAllRestaurantDetails() throws IDNotFoundException {
    	RestaurantDetails restaurantdetails=new RestaurantDetails();
    	restaurantdetails.setRestaurantDetailsId(1);
        restaurantdetails.setRestaurantOwnerName("Sandhya");
        restaurantdetails.setRestaurantName("Oyster Bay");
        restaurantdetails.setRestaurantPhone("9876543212");
        restaurantdetails.setRestaurantAddress("Tirupathi");
        restaurantdetails.setDeliveryBoyId("1");
        restaurantdetails.setDeliveryBoyName("Tom");
        restaurantdetails.setDeliveryBoyPhone("8976542315");
        int restaurantDetailsId=restaurantdetails.getRestaurantDetailsId();
      //  Mockito.when(orderRepository.findAll()).thenReturn(orderlist);
     //   assertThat(paymentService.viewPaymentDetailsById(paymentId)).isEqualTo(payment);
        List<RestaurantDetails> restaurantdetailslist = new ArrayList<>();
        Mockito.when(restaurantdetailsRepository.findAll()).thenReturn(restaurantdetailslist);
        assertThat(adminService.getAllRestaurantDetails()).isEqualTo(restaurantdetailslist);
        
    }
    @Test
    void createOrder() {
        Order order=new Order();
        order.setorderId(1);
        order.setUserName("Sandhya");
        order.setUserPhone("9121393187");
        order.setUserEmailId("chatu@gmail.com");
        order.setUserAddress("Tirupathi");
               Mockito.when(orderRepository.save(order)).thenReturn(order);
        assertThat(adminService.createOrder(order)).isEqualTo(order);
            
        }
    
    @Test
    void deleteOrderTest() throws IDNotFoundException {
        Order order=new Order();
        order.setorderId(1);
        order.setUserName("Sandhya");
        order.setUserPhone("9121393187");
        order.setUserEmailId("chatu@gmail.com");
        order.setUserAddress("Tirupathi");
        int orderId=order.getOrderId();
        Assert.assertTrue(orderRepository.findById(3).isEmpty());                     
    }    
    @Test
    void getAllOrder() throws IDNotFoundException {
        Order order=new Order();
        order.setorderId(1);
        order.setUserName("Sandhya");
        order.setUserPhone("9121393187");
        order.setUserEmailId("chatu@gmail.com");
        order.setUserAddress("Tirupathi");
        int orderId=order.getOrderId();
      //  Mockito.when(orderRepository.findAll()).thenReturn(orderlist);
     //   assertThat(paymentService.viewPaymentDetailsById(paymentId)).isEqualTo(payment);
        List<Order> orderlist = new ArrayList<>();
        Mockito.when(orderRepository.findAll()).thenReturn(orderlist);
        assertThat(adminService.getAllOrder()).isEqualTo(orderlist);
        
    }
}
  
 