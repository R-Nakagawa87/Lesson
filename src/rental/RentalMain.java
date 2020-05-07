package rental;

import java.util.ArrayList;

public class RentalMain {

	public static void main(String[] args) {

		ArrayList<Item> itemList = new ArrayList<Item>();
		itemList.add(new Book("ワンピース", 7));
		itemList.add(new Cd("パプリカ", 3));
		itemList.add(new Cd("Lemon", 1));

		int sum=0;
		for(Item i:itemList) {
			System.out.println(i.toString());
			sum += i.getPrice();
		}
		System.out.println("合計"+sum+"円");

	}

}
