package com.tka;

import org.springframework.stereotype.Component;

@Component("com1")
public class Company_1 implements Interview {

	public String testTime() {
		return "Reporting time 10:30AM";
	}
}
