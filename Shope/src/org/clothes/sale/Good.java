package org.clothes.sale;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Good {

	private static Logger logger = Logger.getLogger(Good.class.getName());
	
	
	private int code;
	private int price;
	private String name;
	public void printGood(){
		logger.log(Level.INFO,"Good is"+ name +code+price);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Good( String name, int code, int price) {
		this.code = code;
		this.price = price;
		this.name = name;
	}
 public Good(){
	
}
}
