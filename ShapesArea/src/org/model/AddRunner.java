package org.model;

import org.model.impl.Circle;
import org.model.impl.Squer;
import org.model.impl.Triangl;

public class AddRunner {

	public static void main(String[] args) {
		Circle circle1 = new Circle();
		circle1.setRadius(20);
		circle1.printArea();

		Circle circle2 = new Circle();
		circle2.setRadius(43);
		circle2.printArea();

		Squer squer1 = new Squer();
		squer1.setSide(15);
		squer1.printArea();

		Squer squer2 = new Squer();
		squer2.setSide(35);
		squer2.printArea();

		Squer squer3 = new Squer();
		squer3.setSide(24);
		squer3.printArea();

		Triangl triangl1 = new Triangl();
		triangl1.setHight(12);
		triangl1.setSide(40);
		triangl1.printArea();

		Triangl triangl2 = new Triangl();
		triangl2.setHight(32);
		triangl2.setSide(76);
		triangl2.printArea();

	}

	

}
