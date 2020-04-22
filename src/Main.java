
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

		//キャスト変換を使用して平均を求める
		int kokugo = 70, sansu = 75;
		double heikin = ((double)kokugo + (double)sansu) / 2;
		//double heikin = (kokugo + sansu) / 2.0;
		System.out.println("国語(70点)と算数(75点)の平均は" + heikin + "点");

		//35にならないように！
		int num1 = 3, num2 = 5;
		System.out.println("足し算の結果は" + (num1 + num2));

		//改行無しのprint
		System.out.print("私は");
		System.out.print("中川");
		System.out.print("です\n");

		//比較して最大値を出力
		int m = Math.max(10, 20);
		System.out.println("10と20で大きい方は" + m);

		//文字列を数列に変換する
		String age = "31";
		int nAge = Integer.parseInt(age);
		System.out.println("31歳の次は" +  (nAge+1) + "歳です");

		//乱数発生（90未満を出力として）
		int r = new java.util.Random().nextInt(90);
		System.out.println("90未満で乱数を発生させた結果" + r);

		int saikoro = new java.util.Random().nextInt(6) + 1;
		System.out.println("サイコロを振りました.結果は" + saikoro);
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
