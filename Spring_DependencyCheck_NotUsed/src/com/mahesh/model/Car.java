package com.mahesh.model;

public class Car {

	private String modelyear;

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String modelyear) {
		super();
		this.modelyear = modelyear;
	}

	public String getModelyear() {
		return modelyear;
	}

	public void setModelyear(String modelyear) {
		this.modelyear = modelyear;
	}

	@Override
	public String toString() {
		return "Car [modelyear=" + modelyear + "]";
	}

}
