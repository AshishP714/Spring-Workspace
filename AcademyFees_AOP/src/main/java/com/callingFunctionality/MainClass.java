package com.callingFunctionality;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.KiranAcademy.AcademyFees;
import com.KiranAcademy.MyConfig;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		AcademyFees fees = context.getBean(AcademyFees.class);
		fees.pendingFees();
	}
}
