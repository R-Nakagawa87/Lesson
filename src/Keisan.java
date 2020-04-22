
public class Keisan {

	public static void main(String[] args) {
		//テスト
		int num1 = 10;
		System.out.println("10の2倍は" + num1*2);

		//入力した数を計算する
		System.out.println("現在の数：" + num1);
		System.out.println("数を入力して下さい");
		num1 = new java.util.Scanner(System.in).nextInt();
		//System.out.println(num + "の2倍は" + num1*2);
		System.out.println("もう一度数を入力してください");
		int num2 = new java.util.Scanner(System.in).nextInt();
		System.out.println("2つの数の合計は" + (num1 + num2));
	}

}
