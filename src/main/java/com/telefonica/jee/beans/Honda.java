package com.telefonica.jee.beans;

import org.springframework.stereotype.Component;

@Component("honda")
public class Honda implements Car {

	@Override
	public String showName() {
		return "Honda";
	}

}
