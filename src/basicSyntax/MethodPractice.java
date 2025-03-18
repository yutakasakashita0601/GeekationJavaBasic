package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		console(addition(a,b));
		console(subtraction(a,b));
		console(multiplication(a,b));
		console(division(a,b));
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
	
	public static void console(int result) {
		System.out.println("計算結果は" + result + "です。");
	}

}
