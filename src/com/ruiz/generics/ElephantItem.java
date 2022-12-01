package com.ruiz.generics;

public class ElephantItem <U> implements Moveable<U>{
	
	private String location;
	private U item;

	@Override
	public void move(U t, String locationCode) {
		item =t;
		location =locationCode;
		
	}

	@Override
	public U getItemBeingMove() {
		// TODO Auto-generated method stub
		return item;
	}

	@Override
	public String getLocationBeingMovedTo() {
		return location;
	

	}

}
