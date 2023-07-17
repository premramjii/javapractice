package javaPractice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Property {
	public static void main(String[] args) {
		Set<Integer> s1 = new TreeSet<>();
     s1.add(20);
     s1.add(40);
     s1.add(60);
     s1.add(80);
     s1.add(40);
     System.out.println(s1);
     boolean contains = s1.contains(40);
     System.out.println(contains);
     for (Integer integer : s1) {
		System.out.println(integer);
	}
	
	}
	 
	}
	
	
	




