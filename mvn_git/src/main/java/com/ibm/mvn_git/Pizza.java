package com.ibm.mvn_git;

public class Pizza {
	private String S="100";
	private String M="200";
	private String L="300";
	private int toppingPrice=50;
	private String base = "XYZ";
	
	public void order(String size, int toppings, String base) throws OrderCancelledException, BaseException {
		if((size.equalsIgnoreCase("S") || size.equalsIgnoreCase("M") || size.equalsIgnoreCase("L")) && 
				(2<toppings || toppings>5) &&  base.equalsIgnoreCase("XYZ")) {
			System.out.println("Order Summary: "+size+" Price:: ="+toppings*toppingPrice);

		}
		if (!base.equalsIgnoreCase("xyz")){
			throw new BaseException("Not Available");
		}
		if(toppings<0) {
			throw new NumberFormatException();
		}
		else {
			throw new OrderCancelledException("Order can't be placed");
		}
	}
	public static void main(String[] args) throws BaseException {
		Pizza pi = new Pizza();
		try {
			pi.order("S", 1,"XYZ");
		} catch (OrderCancelledException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
