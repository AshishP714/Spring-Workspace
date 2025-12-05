package com.tka;

import org.springframework.stereotype.Component;

@Component("com2")
public class Company_2 implements Interview{

	public String testTime() {
		return "Reporting time 01:30AM";
	}
}
