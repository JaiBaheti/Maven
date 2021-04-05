package com.ibm.mvn_git;

public class Pizza {
	private String S="100";
	private String M="200";
	private String L="300";
	private int toppingPrice=50;
	
	public void order(String size, int toppings) throws OrderCancelledException {
		if((size.equalsIgnoreCase("S") || size.equalsIgnoreCase("M") || size.equalsIgnoreCase("L")) && 
				(2<toppings || toppings>5)) {
			System.out.println("Order Summary: "+size+" Price:: ="+toppings*toppingPrice);

		}
		if(toppings<0) {
			throw new NumberFormatException();
		}
		else {
			throw new OrderCancelledException("Order can't be placed");
		}
	}
	public static void main(String[] args) {
		Pizza pi = new Pizza();
		try {
			pi.order("S", 1);
		} catch (OrderCancelledException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
