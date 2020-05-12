package obj;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class KukuMain {

	public static void main(String[] args) {
		int kotae = 0;

		ArrayList<KukuMondai> kmList = new ArrayList<KukuMondai>();

		for(int i=0; i<5; i++) {
			kmList.add(new KukuMondai());
		}

		try {

			for(KukuMondai km: kmList) {
				km.show();
				kotae = new java.util.Scanner(System.in).nextInt();
				km.check(kotae);
			}

		}catch(InputMismatchException e) {
			System.out.println("エラー："+e.getMessage());
			e.printStackTrace();
		}
	}

}
