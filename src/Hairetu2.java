
public class Hairetu2 {

	public static void main(String[] args) {
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
		for(String value:names) {
			System.out.print(value + " ");
		}
		System.out.println();
		System.out.println();

		//配列の合計や個数を求める
		int[] points = {80,90,60,70,50};
		System.out.print("points：");
		int pointsSum = 0, pointsCount = 0;

		for(int value: points) {
			if(value >=70) {
				pointsCount++;		//70点以上の数をカウント
			}
			pointsSum += value;	//合計を計算

			System.out.print(value + " ");	//ポイントを出力
			System.out.println();
		}

		System.out.println("ポイントの合計：" + pointsSum);
		System.out.println("ポイントが70点以上のものの数：" + pointsCount);
		System.out.println();

		//拡張forで表示
		int[] data = {5,8,7,9,6};
		for(int value:data) {
			System.out.print(value + " ");
		}
		System.out.println();
		
		//String型の文字数を求める
		String[] names2 = {"コーラ", "コーヒー", "水"};
		for(String value:names2) {
			System.out.print(names2 + "は" + value.length() + "文字 ");
		}
		System.out.println();
		System.out.println();
	}
	

}
