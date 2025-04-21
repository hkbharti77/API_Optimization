package com.picker.pickSpot.dto;

public class Container {
	
	private String id;
	private String size;
	private int x;
	private int y;
	private boolean needsCold;
	//private boolean occupied;
	
	
	
	
	
	
	//public boolean isOccupied() {
		//return occupied;
	//}
	//public void setOccupied(boolean occupied) {
		//this.occupied = occupied;
	//}
	public boolean isNeedsCold() {
		return needsCold;
	}
	public void setNeedsCold(boolean needsCold) {
		this.needsCold = needsCold;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	

}
