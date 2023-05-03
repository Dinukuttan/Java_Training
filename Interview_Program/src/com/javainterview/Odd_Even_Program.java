package com.javainterview;

//import java.util.Scanner;

public class Odd_Even_Program {

	public static void main(String[] args) {
		int a[] = {25,44,67,99,124,31};
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2==0) {
				System.out.println("Even Number is :"+" "+a[i]);
			} else {
                System.out.println("Odd number is :"+" "+a[i]);
			}
					}

}
}
