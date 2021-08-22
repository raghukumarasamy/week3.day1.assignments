package org.methodoverride;

public class Students {

	public void getStudentInfo(int i, String Name) {
		System.out.println("Student Id: " + i + "	Student Name: " + Name);
	}

	public void getStudentInfo(String email, long phno) {
		System.out.println("Student email: " + email + "	Student phno: " + phno);
	}

	public static void main(String[] args) {

		Students obj = new Students();

		obj.getStudentInfo(162, "Raghu K");
		obj.getStudentInfo("rocker.ragu@gmail.com", 9884119664L);

	}

}
