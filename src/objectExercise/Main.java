package objectExercise;

public class Main {

	public static void main(String[] args) {
		String yellowDoubleDashedLine = "\u001B[33m===================================\u001B[0m";

        // アパート情報

		
		System.out.println(yellowDoubleDashedLine);
		Apartment apartment = new Apartment("いい感じアパートメント","山田　マンション太郎","マンション","50000000円","3LDK");
		apartment.information();
		System.out.println(yellowDoubleDashedLine);
		
		System.out.println(yellowDoubleDashedLine);
		Land land = new Land("いい感じの土地","山田　土地太郎","土地","8000000円","105.2㎡");
		land.information();
		System.out.println(yellowDoubleDashedLine);
	}

}
