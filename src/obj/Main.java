package obj;

public class Main {

	public static void main(String[] args) {
		//三角形の面積を求める
		Sankaku s = new Sankaku();
		s.hight = 10;
		s.width = 2;

		Sankaku san = new Sankaku(50,8);

		s.menseki();
		s.menseki(20, 2);

		//商品の名前と価格を表示
		Shouhin shou = new Shouhin();
		shou.name = "りんご";
		shou.price = 100;

		shou.show();
		shou.show("ぶどう", 200);

		//消費税を表示
		shou.showTax("りんご", 100);

		//売れた個数を表示
		Uriage ur = new Uriage();
		ur.shou = shou;
		ur.show(10);
		ur.showUriage(10);

		Shouhin shouMikan = new Shouhin();
		shouMikan.name = "みかん";
		shouMikan.price = 150;
		ur.shou = shouMikan;
		ur.show(3);
		ur.showUriage(3);

		//円の面積、周の長さを求める
		En en = new En();
		en.menseki(2);
		en.ensyu(2);

		//電子マネー
		DensiMoney dm = new DensiMoney();
		dm.charge(1000);
		dm.buy(500);
		System.out.println("現在の金額：" + dm.kingaku);
		System.out.println("現在のポイント：" + dm.point);
		dm.change();
		System.out.println("現在の金額：" + dm.kingaku);
		System.out.println("現在のポイント：" + dm.point);

		//日付の表示
		Hizuke hzk = new Hizuke(4,28);
		hzk.show();

		//日時を表示
		Nichiji ncj = new Nichiji(4,28,15,06);
		ncj.show();


		Book bk = new Book("海", 600, "田中五郎");
		bk.show();


	}



}
