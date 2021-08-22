package org.methodoverride;

public class AxisBank extends BankInfo {
	
	public void deposit () {
		System.out.println("Depositing money in bank // Overridden method");
	}

	public static void main(String[] args) {
		
		AxisBank obj = new AxisBank();
		
		obj.deposit();
		System.out.println("\n");
		obj.saving();
		System.out.println("\n");
		obj.fixed();
		

	}

}
