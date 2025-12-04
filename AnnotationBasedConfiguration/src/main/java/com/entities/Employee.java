package com.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	@Value("01")
	private int employee_Id;
	
	@Value("Daulat")
	private String employeeName;
	
	@Value("Kochi")
	private String employeeCity;
	
	@Value("4.5 LPA")
	private String employeeSalary;

	public Employee() {
		super();
	}

	public Employee(int employee_Id, String employeeName, String employeeCity, String employeeSalary) {
		super();
		this.employee_Id = employee_Id;
		this.employeeName = employeeName;
		this.employeeCity = employeeCity;
		this.employeeSalary = employeeSalary;
	}

	public int getEmployee_Id() {
		return employee_Id;
	}

	public void setEmployee_Id(int employee_Id) {
		this.employee_Id = employee_Id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeCity() {
		return employeeCity;
	}

	public void setEmployeeCity(String employeeCity) {
		this.employeeCity = employeeCity;
	}

	public String getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(String employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [employee_Id=" + employee_Id + ", employeeName=" + employeeName + ", employeeCity="
				+ employeeCity + ", employeeSalary=" + employeeSalary + "]";
	}
}
