package com.cg.fda.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "ORDER")
public class Order {

	@ApiModelProperty(notes = "Id of the order", name="orderId", required=true, value="order Id")
	@Id
	@Column(name = "order_id", nullable = false)
	private int orderId;	
	
	@ApiModelProperty(notes = "Name of the user", name="userName", required=true, value="User Name")
	@Column(name = "user_name", nullable = false)
	private String userName;
	
	
	@ApiModelProperty(notes = "Phonenumber", name="userPhone", required=true, value="user phone")
	@Column(name = "user_phone", nullable = false)
	private String userPhone;
	
	@ApiModelProperty(notes = "EmailId", name="userEmailId", required=true, value="user Email")
	@Column(name = "user_email_id", nullable = false)
	private String userEmailId;
	
	@ApiModelProperty(notes = "Address", name="userAddress", required=true, value="user Address")
	@Column(name = "user_address", nullable = false)
	private String userAddress;

	public Order() {
		
	}

	
	public Order(int orderId, String userName,
			String userPhone, String userEmailId, String userAddress) {
		super();
		this.orderId = orderId;
		this.userName = userName;
		this.userPhone = userPhone;
		this.userEmailId = userEmailId;
		this.userAddress = userAddress;
	}


	public String getUserEmailId() {
		return userEmailId;
	}


	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}


	public String getUserAddress() {
		return userAddress;
	}


	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}


	public int getOrderId() {
		return orderId;
	}

	public void setorderId(int orderId) {
		this.orderId = orderId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

}