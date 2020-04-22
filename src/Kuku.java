
public class Kuku {

	public static void main(String[] args) {
		System.out.println("九九の練習をします");
		System.out.println("答えを入力してください");

		//計算に使う2つの数を発生
		int r1 = new java.util.Random().nextInt(9) + 1;
		int r2 = new java.util.Random().nextInt(9) + 1;

		System.out.println(r1 + "*" + r2 + "=");

		int trueKotae = r1*r2;	//正しい答え
		int scanKotae = new java.util.Scanner(System.in).nextInt();	//入力された答え

		if (scanKotae == trueKotae ) {
			System.out.println(" 正解");
		}else {
			System.out.println(" 不正解");
			System.out.println("正解は" + trueKotae);
		}
	}

}
