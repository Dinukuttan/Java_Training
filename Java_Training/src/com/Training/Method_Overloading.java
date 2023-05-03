package com.Training;

public class Method_Overloading {
      public void studentDetails(String name,String course,int regno) {
         System.out.println(name+" "+course+" "+regno);
     }
      public void studentDetails(String yop) {
         System.out.println("year of passedout ="+" "+yop);
	}
     public void studentDetails(float cgp) {
        System.out.println("overall percentage is"+" "+ cgp);
	}
public static void main(String[] args) {
	Method_Overloading v = new Method_Overloading();
	       v.studentDetails("Dinesh","BE Aero", 12060);
	       v.studentDetails( "2020");
	       v.studentDetails(8);
}
}
