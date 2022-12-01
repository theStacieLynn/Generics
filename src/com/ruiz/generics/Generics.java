package com.ruiz.generics;

public class Generics {
	
	/**
	 * Generic methods
	 * @param <T>
	 * @param value
	 */
	public <T> void printValues(T value) {
		System.out.println("Value: "+value);
	}
	/*
	 * static generic method
	 * do not need to invoke objects to use static methods
	 * use name of the class and the dot method to use static method
	 */
	public static <T> void staticDisplayValues(T value){
		System.out.println(value);
	}
	
	
	public static <E> void printArray(E[] elements) {
		for(E element: elements) {
			System.out.println(element);
		}
		System.out.println();
	}
}
