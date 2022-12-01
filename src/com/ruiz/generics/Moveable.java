package com.ruiz.generics;

public interface Moveable <T>{
	
	/*
	 * create 3 abstract methods
	 * note: abstract methods do not have emplimentation (no code blocks)
	 */
	void move(T t, String locationCode);
	
	T getItemBeingMove();
	
	String getLocationBeingMovedTo();
}
