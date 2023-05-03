package com.Training;

public class School_Register extends Method_Overriding {
@Override
    public void studentName(String name) {
	   super.studentName(name);
    }
@Override
	public void initial(char initial) {
		super.initial(initial);
	}
@Override
	public void department(String dept) {
		super.department(dept);
	}
public static void main(String[] args) {
	School_Register r = new School_Register();
	r.studentName("Dinesh");
	r.initial('M');
	r.department("BE Aero");
}
}
