package com.ruiz.generics;

public class MyGenericClassDriver {

	public static void main(String[] args) {
		
		// initialize the MyGenericClass with integer data
		//b/c its parameterized we need to tell it what type of data it will use
		MyGenericClass<Integer> intObg = new MyGenericClass<>(5);
		System.out.println("Generics Class returns: "+ intObg.getData());
		System.out.println();

		//initialize the MyGenericClass with String data
		MyGenericClass<String> stringObg = new MyGenericClass<>("Java");
		System.out.println("Generics Class returns: "+ stringObg.getData());
		
		//initialize with float data type
		MyGenericClass<Float> floatObg = new MyGenericClass<>(54.99f);
		System.out.println("Generics Class returns: "+ floatObg.getData());
		
		// can add user defined types like employee 
		/*
		 * because generics dont work with 
		 */
	}

}
