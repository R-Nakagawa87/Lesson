package obj;

import java.util.ArrayList;

public class DrinkMain {

	public static void main(String[] args) {

		int sum=0;

		ArrayList<Drink> drinks = new ArrayList<Drink>();
		drinks.add( new Drink("コーラ", 500));
		drinks.add( new Drink("サイダー", 350));
		drinks.add( new Drink("コーヒー", 200));

		for(Drink drink:drinks) {
			drink.show();
			sum += drink.amount ;
		}

		System.out.println("合計："+sum+"ml");
	}

}
