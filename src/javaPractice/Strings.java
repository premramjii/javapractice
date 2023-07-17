package javaPractice;

public class Strings {
	
	public static void main(String[] args) {
		String s = "palace";
		String rev ="";
		char ch;
		for (int i = 0; i < s.length(); i++) {
			ch=s.charAt(i);
			rev=ch+rev;
			
		}
		System.out.println(rev);
	}

}
