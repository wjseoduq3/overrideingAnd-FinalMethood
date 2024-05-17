package com.jdy.exer;

public class Car {
	
	String modelName;
	int modelYear;
	private String horsePower;
	String color;
	
	public void printModel() {
		System.out.println("자동차 모델명: "+this.modelName);
	}
	
	public Car() {
		System.out.println("호출됨");
	}

	public Car(String modelName, int modelYear, String horsePower, String color) {
		super();
		this.modelName = modelName;
		this.modelYear = modelYear;
		this.horsePower = horsePower;
		this.color = color;
	}

	
	
	
	
}
