package com.javainterview;

import java.util.Scanner;

public class Time_Calculation {
       public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the input in minutes");
	int input = sc.nextInt();
	int H =input/60;
	int M =input%60;
   System.out.println(H+" "+"hours"+" "+":"+" "+M+" "+"Minutes");
}
}
