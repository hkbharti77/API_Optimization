package com.picker.pickSpot.dto;

public class YardSlot {
	
	public int x;
	public int y;
	public String sizeCap;
	public boolean hasColdUnit;
	public boolean hasOccupied;
	
	
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
	public String getSizeCap() {
		return sizeCap;
	}
	public void setSizeCap(String sizeCap) {
		this.sizeCap = sizeCap;
	}
	public boolean isHasColdUnit() {
		return hasColdUnit;
	}
	public void setHasColdUnit(boolean hasColdUnit) {
		this.hasColdUnit = hasColdUnit;
	}
	public boolean isHasOccupied() {
		return hasOccupied;
	}
	public void setHasOccupied(boolean isOccupied) {
		this.hasOccupied = isOccupied;
	}
	
	
	

}
