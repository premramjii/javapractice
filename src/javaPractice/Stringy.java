package javaPractice;

public class Stringy {

	public static void main(String[] args) {
		String s = "welcome prem to java coding class";
		String rev =" ";
		String[] split = s.split(" ");
		int length = split.length;
		for (String string : split) {
			String s1=" ";
			if(length % 2==0){
			for(int i=string.length()-1;i>=0;i--) {
				char eachchar = string.charAt(i);
				s1 =s1+eachchar;}
			}
		     else {
				for(int i =0;i<string.length();i++){
					char eachchar = string.charAt(i);
					s1=s1+eachchar;
				}}
			length--;
			rev = rev+s1;

}

		
		System.out.println(rev);			
			
		}

	
}
