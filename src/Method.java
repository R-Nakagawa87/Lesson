
public class Method {

	public static void main(String[] args) {

		System.out.println("helloメソッド呼び出し");
		hello("Nakagawa");
		System.out.println("helloメソッド呼び出し終了");

		int keisanAns = keisan(3, 5);

		int goukeiNum = 100;
		System.out.println("1～" +  goukeiNum +"までの合計は" + goukei( goukeiNum));

		showAge("Nakagawa", 22);

		for(int i=10; i<=20; i++) {
			jijo(i);
		}

		String[] names = {"Yamamoto", "Suzuki", "Sato"};
		for(String name:names) {
			hello(name);
		}

		//奇数か偶数か調べて報告
		int isGusuNum = 9;
		if(isGusu(isGusuNum)) {
			System.out.println(isGusuNum + "は偶数");
		}else {
			System.out.println(isGusuNum + "は奇数");
		}

		//午前か午後かチェック
		int hour = 25;
		System.out.println(getTimeName(hour));

		//配列を表示
		int[] nums = {5,8,9,2};
		printNumArray(nums);

		//文字の配列を表示
		String data = "apple, orange, lemon";
		String[] fruits = data.split(",");
		printNameArray(fruits);

		//配列の最後の数を表示
		System.out.println("配列numsの最後の数は" + getLast(nums));

	}


	//挨拶を表示
	public static void hello(String name) {
		System.out.println(name + ",Hello!");
	}


	//簡単な計算をする
	public static int keisan(int i, int j) {
		System.out.println(i + "+" + j + "=" + (i + j));
		return (i + j);
	}


	//1～numまでの合計を求める
	public static int goukei(int num) {
		int sum = 0;
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		return sum;
	}

	//入力された名前と、年齢を表示
	public static void showAge(String name, int age) {
		System.out.println(name + "さんは" + age + "歳です");
	}


	//numの2乗を表示
	public static void jijo(int num) {
		int x = num * num;
		System.out.println(num + "の2乗は" + x);
	}


	//奇数か偶数かチェック
	public static boolean isGusu(int num) {
		System.out.println("数を入力して下さい");

			//return num%2 == 0;

		if(num%2 == 0) {
			return true;
		}
		return false;
	}


	//午前か午後かチェック
	public static String getTimeName(int hour) {

		if(0<=hour && hour <12) {
		return "午前";
		}
		if(12 <= hour && hour<= 24) {
			return "午後";
		}
		return "エラー";

	}


	//配列受け取って表示
	public static void printNumArray(int[] nums){
		for(int num: nums) {
		System.out.print(num + " ");
		}
		System.out.println();
		System.out.println();
	}

	public static void printNameArray(String[] names){
		for(String name: names) {
		System.out.print(name + " ");
		}
		System.out.println();
		System.out.println();
	}


	//配列の最後の数を表示
	public static int getLast(int[] array) {
		return array[array.length - 1];
	}

}
