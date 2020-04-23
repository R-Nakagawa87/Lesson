
public class Hairetu {

	public static void main(String[] args) {
		//配列に5つの要素を入れる
		int[] scores = new int[5];
		scores[0] = 20;
		scores[1] = 30;
		scores[2] = 40;
		scores[3] = 50;
		scores[4] = 60;
		System.out.println(scores[0]);
		System.out.println();

		//配列の長さ、中身を見る
		int[] prices = {100, 200, 150};
		System.out.println("配列の長さ：" + prices.length);
		System.out.print("配列の中身：");
		for(int i: prices) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();

		//String型の配列を作る
		String[] names = {"コーラ", "コーヒー", "水"};
		System.out.print("商品のラインナップ：");
		for(String i:names) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();

		//配列の合計や個数を求める
		int[] points = {80,90,60,70,50};
		System.out.print("points：");
		int pointsSum = 0, pointsCount = 0;

		for(int i: points) {
			if(i >=70) {
				pointsCount++;		//70点以上の数をカウント
			}
			pointsSum += i;	//合計を計算

			System.out.print(i + " ");	//ポイントを出力
			System.out.println();
		}

		System.out.println("ポイントの合計：" + pointsSum);
		System.out.println("ポイントが70点以上のものの数：" + pointsCount);
		System.out.println();

		//DNA記号をランダムに表示
		int[] seq = new int[6];

		for(int i:seq) {
			//配列の中身をランダムに生成
			seq[i] = new java.util.Random().nextInt(4);

			//DNA記号の型を生成
			char[] base = {'A','T','G','C',};

			System.out.print(base[seq[i]] + " ");
		}
		System.out.println();
		System.out.println();


		System.out.println("ポイントの合計：" + pointsSum);
		System.out.println("ポイントが70点以上のものの数：" + pointsCount);
		System.out.println();

		//
		int[] scores2 = new int[5];
		scores[0] = 20;

	}

}
