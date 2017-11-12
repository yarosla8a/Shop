package org.model.impl;

import org.model.Shapes;

public class Squer implements Shapes {
	private int side;

	public void printArea() {
		System.out.println("Area of this Squer is" + side * side + "sq.m.");

	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

} 


