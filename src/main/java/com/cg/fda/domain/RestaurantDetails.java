package com.cg.fda.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "Restaurant_Detail")
public class RestaurantDetails {

	@ApiModelProperty(notes = "Id of the Restaurant Details", name="restaurantDetailsId", required=true, value="Restaurant Details Id")
	@Id
	@Column(name = "restaurant_details_id", nullable = false)
	private int restaurantDetailsId;	
	
	@ApiModelProperty(notes = "Name of the Restaurant owner", name="restaurantOwnerName", required=true, value="Restaurant Owner Name")
	@Column(name = "restaurant_owner_name", nullable = false)
	private String restaurantOwnerName;
	
	
	@ApiModelProperty(notes = "Name of the Restaurant", name="restaurantName", required=true, value="Restaurant Name")
	@Column(name = "restaurant_name", nullable = false)
	private String restaurantName;
	
	@ApiModelProperty(notes = "Phone of the Restaurant", name="restaurantPhone", required=true, value="Restaurant Phone")
	@Column(name = "restaurant_phone", nullable = false)
	private String restaurantPhone;
	
	@ApiModelProperty(notes = "Address of the Restaurant", name="restaurantAddress", required=true, value="Restaurant Address")
	@Column(name = "restaurant_address", nullable = false)
	private String restaurantAddress;
	
	@ApiModelProperty(notes = "Food items of the Restaurant", name="restaurantFoodItems", required=true, value="Restaurant Food Items")
	@Column(name = "restaurant_food_items", nullable = false)
	private String restaurantFoodItems;
	
	@ApiModelProperty(notes = "Price of the Food Items", name="foodItemsPrice", required=true, value="Food Items Price")
	@Column(name = "food_items_price", nullable = false)
	private String foodItemsPrice;
	
	@ApiModelProperty(notes = "Delivery boy Id", name="deliveryBoyId", required=true, value="Delivery Boy Id")
	@Column(name = "delivery_boy_id", nullable = false)
	private String deliveryBoyId;
	
	@ApiModelProperty(notes = "Delivery boy Name", name="deliveryBoyName", required=true, value="Delivery Boy Name")
	@Column(name = "delivery_boy_name", nullable = false)
	private String deliveryBoyName;
	
	@ApiModelProperty(notes = "Delivery boy Phone", name="deliveryBoyPhone", required=true, value="Delivery Boy Phone")
	@Column(name = "delivery_boy_phone", nullable = false)
	private String deliveryBoyPhone;

	public RestaurantDetails() {
		
	}

	
	public RestaurantDetails(int restaurantDetailsId, String restaurantOwnerName,
			String restaurantName, String restaurantPhone, String restaurantAddress, String restaurantFoodItems, String foodItemsPrice, String deliveryBoyId, String deliveryBoyName, String deliveryBoyPhone) {
		super();
		this.restaurantDetailsId = restaurantDetailsId;
		this.restaurantOwnerName = restaurantOwnerName;
		this.restaurantName = restaurantName;
		this.restaurantPhone = restaurantPhone;
		this.restaurantAddress = restaurantAddress;
		this.restaurantFoodItems = restaurantFoodItems;
		this.foodItemsPrice = foodItemsPrice;
		this.deliveryBoyId = deliveryBoyId;
		this.deliveryBoyName = deliveryBoyName;
		this.deliveryBoyPhone =  deliveryBoyPhone;
		
		
	}


	public int getRestaurantDetailsId() {
		return restaurantDetailsId;
	}


	public void setRestaurantDetailsId(int restaurantDetailsId) {
		this.restaurantDetailsId = restaurantDetailsId;
	}


	public String getRestaurantOwnerName() {
		return restaurantOwnerName;
	}


	public void setRestaurantOwnerName(String restaurantOwnerName) {
		this.restaurantOwnerName = restaurantOwnerName;
	}


	public String getRestaurantName() {
		return restaurantName;
	}


	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}


	public String getRestaurantPhone() {
		return restaurantPhone;
	}


	public void setRestaurantPhone(String restaurantPhone) {
		this.restaurantPhone = restaurantPhone;
	}


	public String getRestaurantAddress() {
		return restaurantAddress;
	}


	public void setRestaurantAddress(String restaurantAddress) {
		this.restaurantAddress = restaurantAddress;
	}


	public String getRestaurantFoodItems() {
		return restaurantFoodItems;
	}


	public void setRestaurantFoodItems(String restaurantFoodItems) {
		this.restaurantFoodItems = restaurantFoodItems;
	}


	public String getFoodItemsPrice() {
		return foodItemsPrice;
	}


	public void setFoodItemsPrice(String foodItemsPrice) {
		this.foodItemsPrice = foodItemsPrice;
	}


	public String getDeliveryBoyId() {
		return deliveryBoyId;
	}


	public void setDeliveryBoyId(String deliveryBoyId) {
		this.deliveryBoyId = deliveryBoyId;
	}


	public String getDeliveryBoyName() {
		return deliveryBoyName;
	}


	public void setDeliveryBoyName(String deliveryBoyName) {
		this.deliveryBoyName = deliveryBoyName;
	}


	public String getDeliveryBoyPhone() {
		return deliveryBoyPhone;
	}


	public void setDeliveryBoyPhone(String deliveryBoyPhone) {
		this.deliveryBoyPhone = deliveryBoyPhone;
	}

}
