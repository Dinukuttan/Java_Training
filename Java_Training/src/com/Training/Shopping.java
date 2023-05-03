package com.Training;

public class Shopping implements Mall{

	@Override
	public void cloths() {
System.out.println("Max fashion");		
	}
	@Override
	public void food() {
System.out.println("food court");		
	}
	@Override
	public void entertainment() {
System.out.println("pvr cinemas");		
	}
	@Override
	public void shoes() {
System.out.println("puma");		
	}
public static void main(String[] args) {
	Shopping r = new Shopping();
	r.cloths();
	r.food();
	r.entertainment();
	r.shoes();
}
}
