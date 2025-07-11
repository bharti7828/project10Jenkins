package com.rays.dto;

import java.util.Date;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_ORDER")
public class OrderDTO extends BaseDTO {

	@Column(name = "PRODUCTNAME", length = 50)
	private String productName;

	@Column(name = "ORDERDATE")
	private Date orderDate;

	@Column(name = "QUANTITY")
	private Long  quantity ;

	@Column(name = "CUSTOMER")
	private String customer;


	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getKey() {
		return customer ;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return customer;
	}

	@Override
	public String getUniqueKey() {
		return "productName";
	}

	@Override
	public String getUniqueValue() {
		return productName;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return productName;
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("productName", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("customer", customer);
		return map;
	}
}