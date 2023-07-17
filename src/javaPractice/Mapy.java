package javaPractice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Mapy {

	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		Set<Integer> s1 = new LinkedHashSet<Integer>();
		s.add("api");
		s.add("sql");
		s.add("agile");
		s1.add(20);
		s1.add(60);
		s1.add(10);
		System.out.println(s.isEmpty());
		// Iterator iterator = s1.iterator();
		// System.out.println(iterator);
		System.out.println(s);
		String[] array = new String[s.size()];
		s.toArray(array);
		System.out.println(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	String s = "welcome prem to testing team";
	String rev = "";
	String[] split = s.split(" ");
	
	int length = split.length;
	for(
	
	String string:split)
	{
		String s1 = "";
		if (length % 2 == 0) {
			for (int i = string.length() - 1; i >= 0; i--) {
				char charAt = string.charAt(i);
				s1 = s1 + charAt;
			}
		} else {
			for (int i = 0; i < string.length(); i++) {
				char charAt = string.charAt(i);
				s1 = s1 + charAt;
			}
		}
		length--;
		rev = rev + s1 + " ";
	}System.out.println(rev);
}

}
