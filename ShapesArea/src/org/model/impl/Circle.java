package org.model.impl;

import org.model.Shapes;

public class Circle  implements Shapes {
	private int radius;

	public void printArea() {
		System.out.println("Area og this Circle is"+Math.PI*radius * radius + "sq.m.");

	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
		
	}

}