package com.BeveragesBackend;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Dao.My_CartDAO;
import com.Dao.ProductDAO;
import com.Model.My_Cart;
import com.Model.Product;

public class My_CartTestCase {

	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	Product product;
	
	@Autowired
	ProductDAO productDAO;
	
	@Autowired
	static My_CartDAO my_CartDAO;
	@Autowired
	static My_Cart my_Cart;
	
	@BeforeClass
	public static void initialize()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		
		//get the categoryDAO from context
		my_CartDAO =  (My_CartDAO) context.getBean("my_CartDAO");
		
		//get the category from context
		my_Cart = (My_Cart)context.getBean("my_Cart");
		
	}
	/*
	@Test
	public void createCartTestCase() {
		//my_Cart.setId(100);
		my_Cart.setUser_id("anantha");
		my_Cart.setPrice(210);
		my_Cart.setProduct_name("Lydia");
		my_Cart.setDate_added(new Date());
		my_Cart.setQuantity(5);
		my_Cart.setStatus("Arriving");
		boolean flag = my_CartDAO.save(my_Cart);
		
		assertEquals("createCartTestCase",true,flag);
	}
	
	@Test
	public void deleteCartTestCase(){
		boolean flag = my_CartDAO.deleteAllProductsInCart("IsaacDV");
		
		assertEquals(true, flag);
	}
	
*/
}
