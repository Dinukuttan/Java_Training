package com.Training;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_Method {
public static void main(String[] args) {
	List<Integer> k = new ArrayList<Integer>();
	     k.add(null);
	     k.add(10);
	     k.add(20);
	     k.add(30);
	     k.add(40);
	     k.add(50);
	     int size = k.size();
	     System.out.println(size);
	     Integer integer = k.get(2);
	     System.out.println(integer);
	     Integer set = k.set(1,50);
	     System.out.println(set);
	     Integer remove = k.remove(5);
	     System.out.println(remove);
	     int indexOf = k.indexOf(30);
	     System.out.println(indexOf);
	     boolean contains = k.contains(50);
	     System.out.println(contains);
	     List<Integer> k1 = new LinkedList<Integer>();
	     k1.add(12);
	     k1.add(34);
	     k.addAll(k1);
	     System.out.println(k);
}
}
