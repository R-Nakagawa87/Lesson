
public class LoopSample {

	public static void main(String[] args) {
		//while文で5回「Hello」を表示
//		int num = 0;
//		while(num < 5) {
//			System.out.println("Hello");
//			num++;
//		}

		//while文で1～4までの数を表示
//		int num2 = 0;
//		while(num<5) {
//			System.out.println(num);
//			num++;
//		}

		//while文で0以上10以下の奇数を表示
//		int num3 = 1;
//		while(num3<=10) {
//			System.out.println(num3);
//			num3 = num3+2;
//		}

		//for文で10以下の数を表示
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//		}

		//for文で0～4までの数を表示
//		for(int i=0; i<5; i++) {
//			System.out.println(i);
//		}

		//for文で0以上10以下の奇数を表示
//		for(int i=1; i<=10; i+=2) {
//			System.out.println(i);
//		}

		//0を入力するまで、入力した数を2倍にして出力
//		System.out.println("数を入力して下さい");
//		int num5 = new java.util.Scanner(System.in).nextInt();
//		while(num5 != 0) {
//				System.out.println("入力した数の2倍は" + num5*2);
//				System.out.println("数を入力して下さい");
//				num5 = new java.util.Scanner(System.in).nextInt();
//		}

		//do-while文で0を入力するまで、入力した数を2倍にして出力
//		int num6;
//		do {
//			System.out.println("数を入力して下さい");
//			num6 = new java.util.Scanner(System.in).nextInt();
//			if(num6 != 0) {
//				System.out.println("入力した数の2倍は" + num6*2);
//			}else {
//				System.out.println(num6 + "が入力されたので処理を終了します");
//			}
//		}while(num6 != 0);

		//九九を表示
//		for(int i=1; i<10; i++) {
//			for(int j=1; j<10; j++) {
//				System.out.print(i*j + " ");
//			}
//			System.out.println();
//		}

		//iが3になったら処理終了
//		for(int i=0; i<=10; i++) {
//			if(i==3) {
//				break;
//			}
//			System.out.println(i);
//		}

		//iが3の時を除いて10まで表示
//		for(int i=0; i<=10; i++) {
//		if(i==3) {
//			continue;
//		}
//		System.out.println(i);
//		}

		//do-while文で0を入力するまで、入力した数を2倍にして出力(無限ループ使用版)
//		int num7;
//		do {
//			System.out.println("数を入力して下さい");
//			num7 = new java.util.Scanner(System.in).nextInt();
//			if(num7 != 0) {
//				System.out.println("入力した数の2倍は" + num7*2);
//			}else {
//				System.out.println(num7 + "が入力されたので処理を終了します");
//				break;
//			}
//		}while(true);

		//数を入力後、1から入力した数までを表示
		System.out.println("数を入力して下さい");
		int num8 = new java.util.Scanner(System.in).nextInt();
		for(int i=1; i <= num8; i++) {
			System.out.println(i);
		}
	}

}