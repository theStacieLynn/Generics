package com.ruiz.generics;

public class GenericsDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("======Invoking regular method======");
		
		Generics obj = new Generics();
		
		obj.printValues(43);
		obj.printValues("Java Programmer");
		obj.printValues(4.43);
		obj.printValues(true);
		
		/*
		 * use static method
		 */
		System.out.println();
		Generics.staticDisplayValues(254);
		Generics.staticDisplayValues("Java Developer");
		Generics.staticDisplayValues(254.45);
		
		/*
		 * generic <E> method
		 */
		System.out.println();
		Integer[] intArray= {10,20,30,40,50};
		Character[] charArray= {'j','a','v','a'};
		
		System.out.println("Printing Inter array");
		Generics.printArray(intArray);
		
		System.out.println("Printing Char array");
		Generics.printArray(charArray);
		
		System.out.println("======Invoking generic interface======");
		ElephantItem<Integer> obgMove = new ElephantItem<>();
		obgMove.move(5, "Austin");
		System.out.println(obgMove.getItemBeingMove()+ " Item");
		System.out.println(obgMove.getLocationBeingMovedTo()+ " Location");
		
		System.out.println("======Bonded Type======");
		MathBox<Integer> mObj= new MathBox<Integer>(5);
		MathBox<Double> mObj2= new MathBox<Double>(49.00);
		
		System.out.println(mObj.sqrt());
		System.out.println(mObj2.sqrt());
		
	}

}
