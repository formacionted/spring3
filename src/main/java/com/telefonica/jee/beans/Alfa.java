package com.telefonica.jee.beans;

import org.springframework.stereotype.Component;

@Component("alfa")
public class Alfa implements Car {

	@Override
	public String showName() {
		return "Alfa";
	}

}
