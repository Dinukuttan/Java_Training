package com.Training;

public class EmployeDetails {
    public EmployeDetails() {
      System.out.println("Dinesh");
    }
    public EmployeDetails(String company) {
      System.out.println(company);
	}
    public EmployeDetails(int accNum) {
      System.out.println(accNum);
	}
    public EmployeDetails(char initial) {
     System.out.println(initial);
	}
   public static void main(String[] args) {
	EmployeDetails s = new EmployeDetails();
	EmployeDetails s1 = new EmployeDetails("Globe");
	EmployeDetails s2 = new EmployeDetails(12345);		
	EmployeDetails s3 = new EmployeDetails('M');
} 
}
