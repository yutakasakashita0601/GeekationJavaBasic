package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		console(a,b);
	}
	
	public static int addition(int a, int b) {
		return  a +b;
	}
	
	public static int subtraction(int a, int b) {
		return a -b;
	}
	
	public static int multiplication(int a, int b) {
		return a *b;
	}
	
	public static int division(int a, int b) {
		return a/b;
	}
	
	public static void console(int a, int b) {
		System.out.println("計算結果は" + addition(a, b) + "です。");
		System.out.println("計算結果は" + subtraction(a, b) + "です。");
		System.out.println("計算結果は" + multiplication(a, b) + "です。");
		System.out.println("計算結果は" + division(a, b) + "です。");
	}

}
