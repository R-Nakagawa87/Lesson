package obj;

import java.util.ArrayList;

public class ChugakuseiMain {

	public static void main(String[] args) {
		int allsum=0;

		ArrayList<Chugakusei> cgList = new ArrayList<Chugakusei>();
		cgList.add( new Chugakusei("田中",70,70,70,70) );
		cgList.add( new Chugakusei("佐藤",80,80,80,80) );
		cgList.add( new Chugakusei("竹中",90,90,90,90) );

		for(Chugakusei cg:cgList) {
			cg.show();
			allsum += cg.goukei();
		}
		System.out.println("全員の合計："+allsum);
		
	}

}
