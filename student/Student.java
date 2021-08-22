package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("Student Name: Raghu K");

	}

	public void studentDept() {
		System.out.println("Student Dept: CS");

	}

	public void studentId() {
		System.out.println("Student Id: 03UR162");

	}

	public static void main(String[] args) {
	
		Student obj = new Student();
		
		System.out.println("Calling from same class: College");
		obj.studentName();
		obj.studentDept();
		obj.studentId();
		
		System.out.println("\n");
		System.out.println("Calling from Parent class: Department");
		obj.deptName();
		
		System.out.println("\n");
		System.out.println("Calling from GrandParent class: College");
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.noOfPlayGrounds();
		

	}

}
