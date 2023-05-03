package com.Training;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_Types {
public static void main(String[] args) {
	List<Integer> k = new ArrayList<Integer>();
	       k.add(50);
	       k.add(70);
	       k.add(120);
	       k.add(150);
	       k.add(200);
	       int size = k.size();
	       System.out.println(size);
	       Integer integer = k.get(3);
	       System.out.println(integer);
	       Integer set = k.set(1,2);
	       System.out.println(set);
	       Integer remove = k.remove(3);
	       System.out.println(remove);
	       int indexOf = k.indexOf(5);
	       System.out.println(indexOf);
	       boolean contains = k.contains(120);
	       System.out.println(contains);
	       List<Integer> m = new LinkedList<Integer>();
	       m.add(250);
	       m.add(75);
	       m.addAll(k);
	       System.out.println(m);
	       m.retainAll(k);
	       System.out.println(m);
	       k.removeAll(k);
	       System.out.println(m);
   }
   }
