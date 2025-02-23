package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		boolean isGreatA = (a > b);
		System.out.println(isGreatA);

		boolean isSunny = true;
		boolean isWarm = true;
		boolean result = isSunny && isWarm;
		System.out.println(result);

		int x = 3;
		int y = 6;
		boolean isEpual = (x >= 0 && y % 2 == 0);
		System.out.println(isEpual);

		boolean hasPermission = false;
		System.out.println(!hasPermission);
	}

}
