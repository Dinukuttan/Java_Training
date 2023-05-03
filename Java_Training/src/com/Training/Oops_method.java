package com.Training;

public class Oops_method {

	public void employeName(String name) {
         System.out.println(name);
	}
    public void employeId(int id) {
         System.out.println(id);
	}
    public void employeSapId(int sapId) {
        System.out.println(sapId);
    }
    public void employeDob(String dob) {
        System.out.println(dob);
       }
    public void accNum(float accNum) {
        System.out.println(accNum);
       }
public static void main(String[] args) {
	Oops_method r = new Oops_method();
r.employeName("Dineshkumar");
r.employeId(12060);
r.employeSapId(120);
r.employeDob("04/01/1998");
r.accNum(12345);
}
}
