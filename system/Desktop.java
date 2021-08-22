package org.system;

public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("Desktop size is: 14inch");

	}

	public static void main(String[] args) {
		Desktop obj = new Desktop();
		
		System.out.println("Calling from parent class: Computer");
		obj.computerModel();

		System.out.println("\n");
		System.out.println("Calling from same class: Desktop");
		obj.desktopSize();

	}

}
