package com.main_functionality;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tka.MyConfig;
import com.tka.Student;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		Student s = context.getBean(Student.class);
		System.out.println(s.getInter1().testTime());
		System.out.println(s.getInter1().testTime());
	}
}