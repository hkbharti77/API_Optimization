package com.picker.pickSpot.dto;

public class PickResponse {
	public String containerId;
	public int targetX;
	public int targetY;
	public String error;
	
	
	public PickResponse(String containerId, int targetX, int targetY) {
		super();
		this.containerId = containerId;
		this.targetX = targetX;
		this.targetY = targetY;
		
	}
	
	public PickResponse(String error) {
		this.error = error;
	}
	
	

}
