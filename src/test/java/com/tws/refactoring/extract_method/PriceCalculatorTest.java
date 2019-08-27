package com.tws.refactoring.extract_method;

import org.junit.Test;

import com.tws.refactoring.extract_variable.PriceCalculator;

public class PriceCalculatorTest {
	
    @Test
    void should_return_base_price_when_give_quantity_and_itemPrice() {
    	//given
    	PriceCalculator priceCalculator=new PriceCalculator ();    	
    	//when
    	double result=priceCalculator.getBasePrice(10,5);
    	//then
    	
    }
}
