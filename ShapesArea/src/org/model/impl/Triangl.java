package org.model.impl;

import org.model.Shapes;

public class Triangl implements Shapes {
	private int side;
	private int hight;

	public void printArea() {
		System.out.println("Area of this Triangl is"+ 1 / 2 * side * hight + "sq.m.");

	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public int getHight() {
		return hight;
	}

	public void setHight(int hight) {
		this.hight = hight;
	}

}

