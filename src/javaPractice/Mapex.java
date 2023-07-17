package javaPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Mapex {
	public static void main(String[] args) {
		Map<String,Integer> m = new HashMap<>();
		m.put("api", 10);
		m.put("java", 30);
		m.put("selenium", 20);
		m.put("sql", 60);
		System.out.println(m);
		Collection<Integer> values = m.values();
		System.out.println(values);
		Set<Entry<String,Integer>> entrySet = m.entrySet();
		System.out.println(entrySet);
		String s="student";
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		System.out.println("age is"+age);
		
		
		
				
	}

}
