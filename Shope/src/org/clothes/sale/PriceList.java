package org.clothes.sale;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PriceList {

	public static Logger logger = Logger.getLogger(PriceList.class.getName());
	

	public static void main(String[] args) {
		Good ts1 = new Good();
		ts1.setName("Tshirt");
		ts1.setCode(111);
		ts1.setPrice(200);
		Good ts2 = new Good("Tshirt", 011, 200);
		ts2.setName("Tshirt");
		ts2.setCode(111);
		ts2.setPrice(200);
		Good ts3 = new Good("Tshirt", 011, 200);
		ts3.setName("Tshirt");
		ts3.setCode(111);
		ts3.setPrice(200);

		ArrayList<Good> pricelist = new ArrayList<>();

		pricelist.addAll(Arrays.asList(ts1, ts2, ts3));

		int totalPrice = getTotalPrice(getChangePrice(pricelist));
		logger.log(Level.INFO, "price of goods" + totalPrice + "UA");

	}
	


	private static int getTotalPrice(ArrayList<Good> pricelist) {
		int totalPrice = 0;

		for (int i = 1; i < pricelist.size(); i++) {
			totalPrice = totalPrice + pricelist.get(i).getPrice();
		}
		return totalPrice;
	}

	private static ArrayList<Good> getChangePrice(ArrayList<Good> pricelist) {
		int j = 1;
		for (int i = 0; i < pricelist.size(); i++) {
			if (i != 0) {
				if (pricelist.get(i).equals(pricelist.get(i - 1))) {
					j = j+1;
					if (i % 3 == 0) {
						int newPrice = pricelist.get(i).getPrice() / 2;
						pricelist.get(i).setPrice(newPrice);
						
					}
				}
				else{
					j=1;
				}
			}
		}
		return pricelist;
	}
}
