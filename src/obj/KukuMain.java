package obj;

import java.util.ArrayList;

public class KukuMain {

	public static void main(String[] args) {
		int kotae = 0;

		ArrayList<KukuMondai> kmList = new ArrayList<KukuMondai>();

		for(int i=0; i<5; i++) {
			kmList.add(new KukuMondai());
		}

		for(KukuMondai km: kmList) {
			km.show();
			kotae = new java.util.Scanner(System.in).nextInt();
			km.check(kotae);
		}

	}

}
