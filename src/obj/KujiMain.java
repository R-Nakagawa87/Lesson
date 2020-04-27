package obj;

import java.util.ArrayList;

public class KujiMain {

	public static void main(String[] args) {

		KujiChecker kc = new KujiChecker();
		Kuji kj = new Kuji();

		ArrayList<Integer> bangos = new ArrayList<Integer>();
		bangos.add(123456);
		bangos.add(345612);
		bangos.add(569874);

		for(int ban:bangos) {
			kj.bango = ban;

			kc.check(kj);
			kj.show();
			System.out.println("現在の金額："+kc.kingaku);
		}

	}

}
