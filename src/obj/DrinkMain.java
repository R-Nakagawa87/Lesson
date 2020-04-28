package obj;

import java.util.ArrayList;

public class DrinkMain {

	public static void main(String[] args) {

		int sum=0;

		ArrayList<Drink> drinkList = new ArrayList<Drink>();
		drinkList.add( new Drink("コーラ", 500));
		drinkList.add( new Drink("サイダー", 350));
		drinkList.add( new Drink("コーヒー", 200));

		for(Drink drink:drinkList) {
			drink.show();
			sum += drink.amount ;
		}

		System.out.println("合計："+sum+"ml");
	}

}
