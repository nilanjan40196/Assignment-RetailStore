package com.capg.test;


import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capg.beans.Product;
import com.capg.beans.ProductType;
import com.capg.beans.User;
import com.capg.beans.UserType;
import com.capg.service.IService;
import com.capg.service.ServiceImpl;

public class RStoreTest {
	
	 static IService service;
	 static User employee,affiliate,normal_cust1,normal_cust2;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		service = new ServiceImpl();
		
		List<Product> product1 = new ArrayList<Product>(
					Arrays.asList(new Product(100, "t-shirt", ProductType.CLOTHING, 2, 500.0),
								  new Product(101, "rice", ProductType.GROCERIS, 2, 70),
								  new Product(102, "paracetamol", ProductType.PHARMACIES, 5, 50),
								  new Product(103, "potato", ProductType.VEGGIES, 3, 40)
							)
				);
		List<Product> product2 = new ArrayList<Product>(Arrays.asList(
					new Product(200, "tomato", ProductType.VEGGIES, 2, 40),
					new Product(201, "carrot", ProductType.VEGGIES, 5, 30),
					new Product(202, "Eggs", ProductType.GROCERIS, 10, 5),
					new Product(203, "iphone", ProductType.ELECTRONICS, 1, 50000),
					new Product(204, "bread", ProductType.GROCERIS, 3, 35)
				)); 
		List<Product> product3 = new ArrayList<Product>(Arrays.asList(
				new Product(300, "cucunber", ProductType.VEGGIES, 6, 20),
				new Product(301, "camera", ProductType.ELECTRONICS, 2, 15000),
				new Product(302, "dry fruits", ProductType.GROCERIS, 20, 20)
			)); 
		List<Product> product4 = new ArrayList<Product>(
					Arrays.asList(
								new Product(401, "med1", ProductType.PHARMACIES, 4, 60),
								new Product(402, "jeans", ProductType.CLOTHING, 2, 2000),
								new Product(403, "mushroom", ProductType.VEGGIES, 5, 40),
								new Product(404, "iron", ProductType.ELECTRONICS, 3, 3000),
								new Product(405, "biscuit", ProductType.GROCERIS, 10, 30)
							)
				);
		employee = new User(1, "Nilanjan", UserType.EMPLOYEE, "2016-02-25", product1);
		affiliate = new User(2, "Dip", UserType.AFFILIATE, "2019-05-19", product2);
		normal_cust1 = new User(3, "sourav", UserType.NORMAL_CUSTOMER, "2017-05-17", product3);
		normal_cust2 = new User(4, "Sayan", UserType.NORMAL_CUSTOMER, "2019-04-15", product4);
		
	}

	

	@Test
	public void testCalBillofEmp() {
		assertEquals(1049 ,service.calculateBill(employee),0);
	}
	
	@Test
	public void testCalBillofAflt() {
		assertEquals(43097 ,service.calculateBill(affiliate),0);
	}
	
	@Test
	public void testCalBillofNormCust() {
		assertEquals(27564 ,service.calculateBill(normal_cust1),0);
	}
	@Test
	public void testCalBillofNormCustLess2() {
		assertEquals(13055 ,service.calculateBill(normal_cust2),0);
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		service = null;
		
	}

}
