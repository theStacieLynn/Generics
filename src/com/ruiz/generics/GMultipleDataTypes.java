package com.ruiz.generics;

public class GMultipleDataTypes<Datatype1,Datatype2> {
	Datatype1 valueOne;
	Datatype2 valueTwo;
	
	//Constructor
	public GMultipleDataTypes(Datatype1 v1, Datatype2 v2) {
		
		this.valueOne = v1;
		this.valueTwo = v2;
	}
	//Getters and setters

	public Datatype1 getValueOne() {
		return valueOne;
	}

	public void setValueOne(Datatype1 valueOne) {
		this.valueOne = valueOne;
	}

	public Datatype2 getValueTwo() {
		return valueTwo;
	}

	public void setValueTwo(Datatype2 valueTwo) {
		this.valueTwo = valueTwo;
	}
	
	
	

}
