package org.clothes.sale;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Tshirt<T> {
	

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(Tshirt.class.getName());
		
		

		ArrayList<Integer> pricelist = new ArrayList<Integer>();
		
		pricelist.add(0);
		pricelist.add(120);
		pricelist.add(105);
		pricelist.add(125);
		pricelist.add(140);
		pricelist.add(160);
		pricelist.add(100);
		pricelist.add(135);
		pricelist.add(115);
		pricelist.add(130);
		pricelist.add(112);
		pricelist.add(126);
		pricelist.add(175);
		pricelist.add(105);
		pricelist.add(170);
		pricelist.add(165);
		pricelist.add(200);
		pricelist.add(155);
		pricelist.add(185);
		pricelist.add(133);

		for (int i = 1; i < pricelist.size(); i++) {
			if (i % 3 == 0) {
				logger.log(Level.INFO, i + "." + "T-shirt " + "-50%" + " = " + pricelist.get(i) / 2 + "UA" + "\n");

			}
		}
		for (int i = 0; i < pricelist.size(); i++) {
			if (i % 3 != 0) {
				logger.log(Level.INFO, i + "." + "T-shirt " + " = " + pricelist.get(i) + "UA" + "\n");

			}
		}
		
		}

}
