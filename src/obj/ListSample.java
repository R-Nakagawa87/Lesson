package obj;

import java.util.ArrayList;

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

	}
}
