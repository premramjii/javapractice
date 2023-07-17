package javaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Stringbuffer {
	private void revstringbuffer() {
		String s = "telscope is given at laber";
		StringBuilder buffer = new StringBuilder(s);
		// buffer.append(s);
		StringBuilder reverse = buffer.reverse();
		System.out.println(reverse);
	}

	private void usingcollections() {
		String s = "telescope";
		char[] eachchar = s.toCharArray();
		List<Character> list = new ArrayList<Character>();
		for (char c : eachchar) {
			list.add(c);
		}
		Collections.reverse(list);
		ListIterator<Character> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			Character character = (Character) listIterator.next();
			System.out.println(character);
		}
	}

	public static void main(String[] args) {
		Stringbuffer oref = new Stringbuffer();
		long starttime = System.currentTimeMillis();
		oref.usingcollections();
		System.out.println(System.currentTimeMillis() - starttime + "ms");
		oref.revstringbuffer();
	}
}