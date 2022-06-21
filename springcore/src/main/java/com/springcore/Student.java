package com.springcore;

public class Student {

	private int studentId;
	private String StudentName;
	private String StudentAddress;
	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		StudentName = studentName;
		StudentAddress = studentAddress;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		System.out.println("*Setting ID*");
		this.studentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
		System.out.println("*Setting Name*");
	}
	public String getStudentAddress() {
		return StudentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		StudentAddress = studentAddress;
		System.out.println("*Setting Address*");
		
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", StudentName=" + StudentName + ", StudentAddress=" + StudentAddress
				+ "]";
	}
	
	
	
}
