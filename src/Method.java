
public class Method {

	public static void main(String[] args) {
		
		System.out.println("helloメソッド呼び出し");
		hello("Nakagawa");
		System.out.println("helloメソッド呼び出し終了");
		
		keisan(3, 5);
		
		goukei(100);
		
		showAge("Nakagawa", 22);
		
		for(int i=10; i<=20; i++) {
			jijo(i);
		}
		
		String[] names = {"Yamamoto", "Suzuki", "Sato"};
		for(String name:names) {
			hello(name);
		}
		
	}


	//挨拶を表示
	public static void hello(String name) {
		System.out.println(name + ",Hello!");
	}


	//簡単な計算をする
	public static void keisan(int i, int j) {
		System.out.println(i + "+" + j + "=" + (i+j));
	}


	//1～numまでの合計を求める
	public static void goukei(int num) {
		int sum = 0;
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		System.out.println("1～" + num +"までの合計は" + sum);
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
}
