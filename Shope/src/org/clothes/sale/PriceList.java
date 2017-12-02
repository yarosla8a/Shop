package org.clothes.sale;

import java.util.ArrayList;
import java.util.Comparator;

import org.clothes.sale.Good;

public class PriceList {
	private ArrayList<Good> pricelist;

	public ArrayList<Good> getPricelist() {
		return pricelist;
	}

	public void setPricelist(ArrayList<Good> pricelist) {
		this.pricelist = pricelist;
	}

	public void makeDiscount(int goods) {
		int totalPrice = 0;
		for (Good good : pricelist) {
			totalPrice = totalPrice + good.getPrice();
			System.out.println("total prace befor sale" + good.getPrice());

		}
		pricelist = getSortedPricelist(pricelist);
		int counter = 1;
		for (int i = 1; i < pricelist.size(); i++) {

			if (pricelist.get(i).equals(pricelist.get(i + 1))) {
				counter++;
			} else {
				counter = 1;
			}
			if (counter % 3 == 0 && pricelist.get(i).getPrice() == pricelist.get(i + 1).getPrice()) {
				int newPrice = pricelist.get(i).getPrice() / 2;
				pricelist.get(i).setPrice(newPrice);

			}

		}
		totalPrice = 0;
		for (Good good : pricelist) {
			totalPrice = totalPrice + good.getPrice();
			System.out.println("total price after sale" + totalPrice);
		}
	}

	private ArrayList<Good> getSortedPricelist(ArrayList<Good> pricelist) {
		Comparator<Good> comparator = new Comparator<Good>(){//comparator сравнивает елементи по кодуж
			@Override
			public int compare(org.clothes.sale.Good ts1, org.clothes.sale.Good ts2) {
				if(ts1.getCode(1).equals(ts2.getCode(2))){
				return 1;
				}
				
	
		return 0;
			
	}
		pricelist.sort(comparator);
		return pricelist;
	
	}
	
	}
}