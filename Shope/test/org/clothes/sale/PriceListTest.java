package org.clothes.sale;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class PriceListTest {

	@Test
	public void testGetChangePrice() {
		Good ts1 = new Good("Tshirt", 011, 200);
		Good ts2 = new Good("Tshirt", 011, 200);
		Good ts3 = new Good("Tshirt", 011, 200);
		ArrayList<Good> pricelist = new ArrayList<>();		
		pricelist.addAll(Arrays.asList(ts1, ts2, ts3));
		PriceList price = new PriceList();
		
		ArrayList<Good> pricelist = price.getChangePrice(ArrayList<Good> pricelist);
		assertEquals(100, pricelist.get('2').getPrice());
		
		
	}

}
