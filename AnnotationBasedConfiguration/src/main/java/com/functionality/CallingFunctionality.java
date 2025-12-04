package com.functionality;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.Config;
import com.entities.Employee;

public class CallingFunctionality {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Employee com = context.getBean(Employee.class);
		System.out.println(com);
	}
}