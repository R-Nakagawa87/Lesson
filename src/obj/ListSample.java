package obj;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListSample {

	public static void main(String[] args) {

		String[] names1 = new String [3];
		names1[0] ="Tanaka";
		names1[1] = "Suzuki";
		names1[2] = "Saito";

		ArrayList<String> names2 = new ArrayList<String>();
		names2.add("Ota");
		names2.add("Miyata");
		names2.add("Shinkai");

		for(String name:names2) {
			System.out.println(name);
		}


		ArrayList<Sankaku> sanList = new ArrayList<Sankaku>();
		sanList.add( new Sankaku(10,20) );
		sanList.add( new Sankaku(20,20) );
		sanList.add( new Sankaku(30,20) );

		for(Sankaku san:sanList) {
			san.menseki();
		}


		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(20);
		intList.add(30);
		intList.set(0, 50);

		System.out.println(intList.get(2));	//Listの2番目の中身を見る
		System.out.println(intList.size()); //Listの長さを見る
		intList.remove(1);	//Listの1番目を削除

		for(int i:intList) {
			System.out.println(i);
		}



		LinkedList<String> sList = new LinkedList<>();
		sList.add("abc");
		sList.add("efg");
		sList.add("hij");
		
		for(String str:sList) {
			System.out.println(str);
		}
		
	}
}
