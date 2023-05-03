package com.Training;

public class String_Concepts {
public static void main(String[] args) {
	String s = "Have a nice day";
	String s1 = "have a nice day";
	String s2 = " ";
	String s3 = null;
	String s4 = "    Happy morning     ";
	String s5 = "5";
	
    int length = s.length();
    System.out.println(length);
    boolean equals = s.equals(s1);
    System.out.println(equals);
    boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
    System.out.println(equalsIgnoreCase);
    String upperCase = s1.toUpperCase();
    System.out.println(upperCase);
    String lowerCase = s.toLowerCase();
    System.out.println(lowerCase);
    boolean startsWith = s1.startsWith(lowerCase);
    System.out.println(startsWith);
    boolean endsWith = s.endsWith("day");
    System.out.println(endsWith);
    boolean contains = s4.contains("morning");
    System.out.println(contains);
    int indexOf = s.indexOf("i");
    System.out.println(indexOf);
    int lastIndexOf = s.lastIndexOf("a");
    System.out.println(lastIndexOf);
    char charAt = s.charAt(3);
    System.out.println(charAt);
    String replace = s.replace("nice","good");
    System.out.println(replace);
    String substring = s.substring(7);
    System.out.println(substring);
    boolean empty = s2.isEmpty();
    System.out.println(empty);
    String trim = s4.trim();
    System.out.println(trim);

}
}

