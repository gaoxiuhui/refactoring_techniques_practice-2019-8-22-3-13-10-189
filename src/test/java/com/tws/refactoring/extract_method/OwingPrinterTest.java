package com.tws.refactoring.extract_method;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;



public class OwingPrinterTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Before
	public void setUpStreams() {
	   System.setOut(new PrintStream(outContent));
	}
	
	@After
	public void cleanUpStreams() {
	   System.setOut(null);
	}
	
	@Test
    public void should_print_print_banner() {
        //Given
    	OwingPrinter owingPrinter=new OwingPrinter();
    	//when
    	owingPrinter.banner();
    	//then
    	String str="*****************************\n****** Customer totals ******\n*****************************\n";
    	assertEquals(str, outContent.toString());
    }
	
	@Test
    public void should_count_Outstanding_to_print_owings() {
        //Given
    	OwingPrinter owingPrinter=new OwingPrinter();
    	Order order1=new Order(3);
    	Order order2=new Order(5);
    	List<Order> orders=new ArrayList<>();
    	orders.add(order1);
    	orders.add(order2);
    	//when
    	String actual=owingPrinter.getOutstanding(orders)+"";
    	//then
    	assertEquals("8.0", actual);
    }
	
	@Test
    public void should_print_details() {
        //Given
    	OwingPrinter owingPrinter=new OwingPrinter();
        String name="apple";
        double price=3.0;
    	//when
    	owingPrinter.owings(name,price);
    	//then
    	System.out.println(outContent.toString());
    	assertEquals("name: "+name+"\n"+"amount: "+price+"\n", outContent.toString());
    }
	
	
    
}