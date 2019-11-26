package com.telefonica.jee.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	private String name;

	@Autowired
	//@Qualifier("honda")
	private Car car;

	public Employee() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public void showDetails() {
		System.out.println("Im " + this.name + " and my car is " + this.getCar().showName());
	}
	
	
	
	
}
