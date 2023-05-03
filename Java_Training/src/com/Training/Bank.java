package com.Training;

public class Bank extends Customer {

	@Override
	public void pinNo() {
		System.out.println("12345");
	}
public static void main(String[] args) {
	Bank v = new Bank();
v.accountNumber(12060);
v.accountHolderName("Dinesh");
v.pinNo();
}
}
