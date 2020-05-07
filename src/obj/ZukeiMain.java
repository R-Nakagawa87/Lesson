package obj;

import java.util.ArrayList;

public class ZukeiMain {

	public static void main(String[] args) {

		Zukei sk = new Shikaku(10,5);
		sk.menseki();

		Zukei en = new En(10);
		en.menseki();

		Zukei san = new Sankaku(10,5);
		san.menseki();

		System.out.println();


		ArrayList<Zukei> zkList = new ArrayList<Zukei>();
		zkList.add(new Shikaku(10,5));
		zkList.add(new Sankaku(10,5));
		zkList.add(new En(4));

		for(Zukei zk:zkList) {
			System.out.println(zk);
			zk.menseki();

			if(zk instanceof En) {
				((En) zk).ensyu();
			}

			System.out.println();
		}

		
		Zukei en1 = new En(4);
		Zukei en2 = new En(4);
		
		if(en1==en2) {
			System.out.println("同じ");
		}else {
			System.out.println("違う");
		}
		
		if(en1.equals(en2)==true) {
			System.out.println("同じ");
		}else {
			System.out.println("違う");
		}



	}
}
