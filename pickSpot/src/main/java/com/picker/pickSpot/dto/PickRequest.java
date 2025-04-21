package com.picker.pickSpot.dto;

import java.util.List;

public class PickRequest {
	
	public Container container;
	public List<YardSlot> yardMap;
	
	
	
	public PickRequest() {
		super();
		// TODO Auto-generated constructor stub
	}



	public PickRequest(Container container, List<YardSlot> yardMap) {
		super();
		this.container = container;
		this.yardMap = yardMap;
	}



	public Container getContainer() {
		return container;
	}



	public void setContainer(Container container) {
		this.container = container;
	}



	public List<YardSlot> getYardMap() {
		return yardMap;
	}



	public void setYardMap(List<YardSlot> yardMap) {
		this.yardMap = yardMap;
	}
	
	
	
	

}
