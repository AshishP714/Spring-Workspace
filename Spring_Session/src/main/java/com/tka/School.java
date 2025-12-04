package com.tka;

public class School {

	private int schoolId;
	private String schoolName;
	private String schoolCity;

	Student stud;

	public School() {
		super();
	}

	public School(int schoolId, String schoolName, String schoolCity, Student stud) {
		super();
		this.schoolId = schoolId;
		this.schoolName = schoolName;
		this.schoolCity = schoolCity;
		this.stud = stud;
	}

	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolCity() {
		return schoolCity;
	}

	public void setSchoolCity(String schoolCity) {
		this.schoolCity = schoolCity;
	}

	public Student getStud() {
		return stud;
	}

	public void setStud(Student stud) {
		this.stud = stud;
	}

	@Override
	public String toString() {
		return "School [schoolId=" + schoolId + ", schoolName=" + schoolName + ", schoolCity=" + schoolCity + ", stud="
				+ stud + "]";
	}
}