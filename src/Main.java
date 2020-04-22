
public class Main {

	public static void main(String[] args) {
		//テスト
		String name = "Ryosuke";
		System.out.println("名前は" + name + "です");

		//日付を表示
		int tuki = 4, hi = 22;
		System.out.println("今日は" + tuki + "月" + hi + "日");

		double pi = 3.14;
		System.out.println("円周率は" + pi + "です");

		//計算の文
		int a = 20;
		int b = a + 5;
		System.out.println(a);
		System.out.println(b);

		//\"エスケープシーケンス\"
		System.out.println("今日は\n\"4月\"です");
		System.out.println("\\100");
		System.out.println("C:\\に\"フォルダ\"を作成");

		//演算子
		int num = 10;
		int amari = num%3;	//10%3
		System.out.println(num + "%3の結果は" + amari);
		num += 5;	//num = 15
		amari = num%3;	//15%3
		System.out.println(num + "%3の結果は" + amari);
		num++;	//インクリメント
		System.out.println("num++の結果は" + num);

		//型の変換
		double d = 3;
		int n = (int)3.0;
		String s = "ベスト" + 3;

		int kokugo = 70, sansu = 75;
		double heikin = ((double)kokugo + (double)sansu) / 2;
		System.out.println("国語(70点)と算数(75点)の平均は" + heikin + "点");

	}

	static public void lesson4_22() {

	}

	static public void lesson4_23() {

	}

	static public void lesson4_24() {

	}

	static public void ensyu1_2(){
	    //練習1-2
	    int a = 3, b = 5;
	    int c = a*b;
	    System.out.println(c);
	}

	static public void ensyu1_3(){
	    //練習1-3
	    boolean b = true;
	    char c = '駆';
	    double d = 3.14;
	    long l = 314159265853979L;
	    String s = "ミナトに攻撃！敵に15ポイントの攻撃を与えた。";
	    System.out.println(b);
	    System.out.println(c);
	    System.out.println(d);
	    System.out.println(l);
	}

}
