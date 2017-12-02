package org.clothes.sale;


public class Good {
	private String name;
	private int code;
	private int price;
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
	public Good(String name, int code, int price) {
		super();
		this.name = name;
		this.code = code;
		this.price = price;
	}
	
	
	

}

