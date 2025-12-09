package com.KiranAcademy;

import org.springframework.stereotype.Component;

@Component
public class AcademyFees {

	public void pendingFees() {
		System.out.println(":- Choose the installment -:");
		System.out.println("	1.Pay coumplete fees 25,000");
		System.out.println("	2.Pay in instalment 10,000");
		System.out.println("	3.Pay in 2 instalment 5,000");
	} 
}
