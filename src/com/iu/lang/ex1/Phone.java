package com.iu.lang.ex1;

public class Phone {

	private int price;
	private int size;
	boolean check = true;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
	public boolean equals(Object obj) {
		Phone phone = (Phone) obj;
		if(this.price!=phone.getPrice()||this.size!=phone.getSize()) {
			check=!check;
		} else {
			check = true;
		}
		return check;
	}
}
