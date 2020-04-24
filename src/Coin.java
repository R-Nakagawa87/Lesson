
public class Coin {

	public static void main(String[] args) {

		int[] coins = {500,100,50,10,5,1};
		int sum = 0;

		for(int coin:coins) {
			sum = sum + coin *  inputMaisu(coin);
			}

		System.out.println(sum + "円");

	}


	//コインの枚数の入力を受ける
	public static int inputMaisu(int num) {

		System.out.println(num + "円玉は何枚？");
		int coinCount = new java.util.Scanner(System.in).nextInt();

		return  coinCount;
	}

}
