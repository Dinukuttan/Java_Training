package com.Training;

import java.util.Scanner;

public class Scanner_Method {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	   System.out.println("enter your name");
	      String name = s.next();
	      System.out.println(name);
	   System.out.println("enter your regno");
	      int regno = s.nextInt();
	      System.out.println(regno);
	   System.out.println("enter your mark");
	      float mark = s.nextFloat();
	      System.out.println(mark);
	
}
}
