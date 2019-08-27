package com.tws.refactoring.extract_method;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class OwingPrinter {
	
    void printOwing(String name, List<Order> orders) {             
        banner();      
        double outstanding=getOutstanding(orders);   
        owings( name,outstanding);
    }
    
    // print banner
    void  banner() { 	
        System.out.println ("*****************************");
        System.out.println ("****** Customer totals ******");
        System.out.println ("*****************************");
    }
    // print owings
   double getOutstanding(List<Order> orders) {
    	 Iterator<Order> elements = orders.iterator();
         double outstanding = 0.0;
         while (elements.hasNext()) {
             Order each = (Order) elements.next();
             outstanding += each.getAmount();
         }
         return outstanding ;
    }
    // print details
    void  owings(String name,double amout) { 	
    	System.out.println("name: " + name);
        System.out.println("amount: " +amout);
    }
}

class Order {
    private final double amount;

    public Order(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
