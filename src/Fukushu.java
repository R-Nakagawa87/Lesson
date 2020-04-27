
public class Fukushu {

	public static void main(String[] args) {
		int[] tensus = {80,60,90,50,70};
		int sum=0, count = 0;

		//拡張forで表示
		System.out.print("点数：");
		for(int tensu:tensus) {
			System.out.print(tensu + " ");

			//合計を求める
			sum += tensu;

			//70点以上はいくつあるか
			if(70 <= tensu) {
				count++;
			}
		}

		System.out.println();

		System.out.println("点数の合計：" + sum);
		System.out.println("70点以上：" + count);

	}

}
