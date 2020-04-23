
public class Coin {

	public static void main(String[] args) {
		int[] coins = {500,100,50,10,5,1};
		int coinCount = 0;
		int i = 0,j = 0,sum = 0;

		for(int coin:coins) {
			System.out.println(coins[i] + "円玉は何枚？");
			coinCount = new java.util.Scanner(System.in).nextInt();

			sum = sum + coins[i] * coinCount;
			i++;
			}

		System.out.println(sum + "円");

	}

}
