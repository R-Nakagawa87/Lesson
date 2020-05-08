package obj;

import java.util.HashSet;
import java.util.Set;

public class SetSample {

	public static void main(String[] args) {

		Set<String> colors = new HashSet<String>();

		colors.add("RED");
		colors.add("YELOW");
		colors.add("GREEN");
		colors.add("RED");

		for(String str:colors) {
			System.out.println(str);
		}



	}

}
