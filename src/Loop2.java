
public class Loop2 {

	public static void main(String[] args) {
		//「こんにちは」を5回表示
		System.out.println("1.");
		for(int i=0; i<5; i++) {
			System.out.println("こんにちは");
		}

		//「1 2 3 4 5」と表示
		System.out.println("2.");
		for(int i=1; i<=5; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		//numに数を入れて0からnumまで表示
		System.out.println("3.");
		System.out.println("数を入力して下さい");
		int num = new java.util.Scanner(System.in).nextInt();
		for(int i=0; i <= num; i++) {
			System.out.println(i);
		}

		//10以下の偶数を表示
		System.out.println("4.");
		System.out.println("10以下の偶数を表示します");
		for(int i=0; i<=10; i+=2) {
		System.out.println(i);
		}

		//「5 4 3 2 1」と表示
		System.out.println("5.");
		for(int i=5; i>0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
