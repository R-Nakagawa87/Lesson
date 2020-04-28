package obj;

import java.util.ArrayList;

public class KujiMain {

	public static void main(String[] args) {

		ArrayList<Kuji> kujiList = new ArrayList<Kuji>();
		kujiList.add(new Kuji(123456));
		kujiList.add(new Kuji(123412));
		kujiList.add(new Kuji(125451));

		KujiChecker kc = new KujiChecker();


		for(Kuji kj:kujiList) {
			kc.check(kj);
			kj.show();
			System.out.println("現在の金額："+kc.kingaku+"円");
		}

	}

}
