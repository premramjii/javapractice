package javaPractice;

public class Swapnumbers {

	private void usingtempvaraiable() {
		int a = 20, b = 50, temp;
		System.out.println("first num" + a + "second num " + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("first num" + a + "second num " + b);
	}

	private void usingmaths() {
		int first = 20, second = 50;
		System.out.println("first num" + first + "second num " + second);
		first = first - second;// -30
		second = first + second;// 20
		first = second - first;// 50
		System.out.println("first num" + first + "second num " + second);

	}

	public static void main(String[] args) {
		Swapnumbers obj = new Swapnumbers();
		obj.usingtempvaraiable();
		obj.usingmaths();
	}

}
