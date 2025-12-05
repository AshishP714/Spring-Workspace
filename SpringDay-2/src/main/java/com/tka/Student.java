package com.tka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Autowired
	@Qualifier("com1")
	Interview inter1;
	
	@Autowired
	@Qualifier("com1")
	Interview inter2;
	
	public Student() {
		super();
	}

	public Student(Interview inter1, Interview inter2) {
		super();
		this.inter1 = inter1;
		this.inter2 = inter2;
	}

	public Interview getInter1() {
		return inter1;
	}

	public void setInter1(Interview inter1) {
		this.inter1 = inter1;
	}

	public Interview getInter2() {
		return inter2;
	}

	public void setInter2(Interview inter2) {
		this.inter2 = inter2;
	}

	@Override
	public String toString() {
		return "Student [inter1=" + inter1 + ", inter2=" + inter2 + "]";
	}
}