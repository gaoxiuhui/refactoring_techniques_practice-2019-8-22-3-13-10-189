package com.tws.refactoring.extract_variable;

public class PriceCalculator {
   public double getPrice(int quantity, int itemPrice) {
        // Price consists of: base price - discount + shipping cost
    	double basePrice=getBasePrice(quantity, itemPrice);
    	double discount=getDiscount(quantity,itemPrice);
    	Double shippingCost=getShippingCost(quantity,itemPrice); 
        return basePrice-discount+shippingCost;
    }
    //base price
    public double getBasePrice(int quantity, int itemPrice) {
    	return quantity * itemPrice ;
    }
    //discount
    public double getDiscount(int quantity, int itemPrice) {
    	return Math.max(0, quantity-500) * itemPrice * 0.05 ;
    }
    //shipping cost
    public double getShippingCost(int quantity, int itemPrice) {
    	return Math.min(quantity * itemPrice * 0.1, 100.0);
    }
}
