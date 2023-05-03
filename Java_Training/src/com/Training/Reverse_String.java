package com.Training;

public class Reverse_String {
	public static void main(String[] args) {
		String a = "Hello Java";
		String[] b = a.split(" ");
		String rev = "";
		for (int i = 0; i < b.length; i++) {
			String c = a.
			String revword ="";
	    for (int j=c.length()-1;j>=0; j--) {
			revword = revword +c.charAt(j);
			
		}
	    rev = rev+revword+" ";
		}
		System.out.println(rev);
}  
}	


