package com.ruiz.generics;

public class MyRunner {

	public static void main(String[] args) {
		//In this class we will invoke the generic method
		
		//Initialize the class with integer data
		DemoClass obj = new DemoClass();
		
		obj.genericsMethod(25);//passing int
		obj.genericsMethod("Per Scholas"); //passing a string
		obj.genericsMethod(2563.5); //passing double
		obj.genericsMethod('H'); //passing a char
		
		
		//Initialize generic class with String and Integer data
		GMultipleDataTypes<String,Integer> obj2 = new GMultipleDataTypes("Texas State University",83);
		
		System.out.println(obj2.getValueOne());
		System.out.println(obj2.getValueTwo());
		
		//Initialize generic class with two Strings
		GMultipleDataTypes<String,String> superNatural = new GMultipleDataTypes("Sam","Dean");
		System.out.println(superNatural.getValueOne());
		System.out.println(superNatural.getValueTwo());
	}

}
