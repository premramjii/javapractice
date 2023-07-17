package javaPractice;

import java.util.Scanner;

public class Reversestring {
	public static void main(String[] args) {
		String s = "56165";
		Scanner in = new Scanner(s);
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char charAt = s.charAt(i);
			rev = rev + charAt;

		}
		System.out.println(rev);
		if (rev.equals(s)) {
			System.out.println("it is palindrome: " + rev);
		} else {
			System.out.println("it is not a palindrome");
		}
	}

}
