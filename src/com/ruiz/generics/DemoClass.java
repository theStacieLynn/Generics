package com.ruiz.generics;

public class DemoClass {
	
	//Create a generic method
	public <T> void genericsMethod(T data) {
		System.out.println("Generics method: ");
		System.out.println("Data passed: "+ data);
	}
//Here, the type parameter <T> is inserted after the public modifier and before the return type void.
//We can call the generics method by placing the actual type <String> and <Integer> inside the bracket 
//before the method name.
}
