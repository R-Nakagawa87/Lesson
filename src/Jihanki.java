
public class Jihanki {

	public static void main(String[] args) {
		//0：コーヒー、1：お茶、2：サイダー
		String[] names = {"コーヒー","お茶","サイダー"};

		//入力を受け付ける
		System.out.println("0：コーヒー、1：お茶、2：サイダー");
		System.out.println("番号を入力して下さい");
		int scanBango = new java.util.Scanner(System.in).nextInt();

		//3以上を入力したときにエラーを表示
		if(scanBango>=3) {
			System.out.println("番号が間違っています");
			System.out.println("もう一度、番号を入力して下さい");
		}else {
			System.out.println("メニュー：" + names[scanBango]);
		}
	}

}
