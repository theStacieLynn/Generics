package com.ruiz.generics;

public class MyGenericClass <T>{
	//parameterized, it doesn't know what type of data it will get return or set
	
	private T data; //declaring variable of T type
	
	//empty constructor
	public MyGenericClass() {
		this.data=(T)data;//casting the t type to data
	}
	//Create a generic class constructor
	public MyGenericClass(T data) {
		this.data = data; //initialize the variable data
	}
	//return a T type variable
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}
