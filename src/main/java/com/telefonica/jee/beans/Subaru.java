package com.telefonica.jee.beans;

import org.springframework.stereotype.Component;

@Component("subaru")
public class Subaru implements Car {

	@Override
	public String showName() {
		return "Subaru";
	}

}
