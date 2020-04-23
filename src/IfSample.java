
public class IfSample {

	public static void main(String[] args) {
		//関係演算子による条件分岐
		boolean tenki = true;
		if(tenki == true) {
			System.out.println("洗濯する");
			System.out.println("散歩する");
		}else {
			System.out.println("DVDを見る");
		}

		int age = 23;
		if(age >= 20) {
			System.out.println("お酒を飲めます");
		}else {
			System.out.println("お酒を飲めません");
		}

		//１0を入力したら当たり。それ以外ははずれ
//		System.out.println("数を入力してください");
//		int scanNum1 = new java.util.Scanner(System.in).nextInt();
//		if(scanNum1 == 10) {
//			System.out.println("当たり");
//		}else {
//			System.out.println("はずれ");
//		}

		//abcを入力したら当たり。それ以外ははずれ
//		System.out.println("文字を入力してください");
//		String scanStr = new java.util.Scanner(System.in).nextLine();
//		if(scanStr.equals("abc")) {
//			System.out.println("当たり");
//		}else {
//			System.out.println("はずれ");
//		}

		//論理演算子を使ってif文の条件を複数使用
//		System.out.println("数字を入力してください");
//		int scanNum2 = new java.util.Scanner(System.in).nextInt();
//		if(5<=scanNum2 && 10>=scanNum2) {
//			System.out.println("当たり");
//		}else {
//			System.out.println("はずれ");
//		}

		//5なら一等、8なら二等、それ以外ははずれ
//		System.out.println("数を入力してください");
//		int scanNum3 = new java.util.Scanner(System.in).nextInt();
//		if(scanNum3 == 5) {
//			System.out.println("一等");
//		}else if(scanNum3 == 8){
//			System.out.println("二等");
//		}else {
//			System.out.println("はずれ");
//		}

		//80点以上は評価A、60点以上は評価B、59点以下は評価C
//		System.out.println("点数を入力してください");
//		int scanTensu = new java.util.Scanner(System.in).nextInt();
//		if(scanTensu >= 80) {
//			System.out.println("評価：A");
//		}else if(scanTensu >= 60){
//			System.out.println("評価：B");
//		}else {
//			System.out.println("評価：C");
//		}

		//入力した番号によって表示を変える
//		System.out.println("1～3の番号を入力して下さい");
//		int scanBango = new java.util.Scanner(System.in).nextInt();
//		if(scanBango == 1) {
//			System.out.println("コーラ");
//		}else if(scanBango == 2) {
//			System.out.println("コーヒー");
//		}else if(scanBango == 3) {
//			System.out.println("水");
//		}else {
//			System.out.println("番号が違います。1～3を入力して下さい");
//		}


		//swith文で条件分岐
//		System.out.println("1～4の番号を入力して下さい");
//		int scanBango = new java.util.Scanner(System.in).nextInt();
//		switch(scanBango){
//			case 1:
//				System.out.println("コーラ");
//				break;
//			case 2:
//			case 4:
//				System.out.println("コーヒー");
//				break;
//			case 3:
//				System.out.println("水");
//				break;
//			default:
//				System.out.println("番号が違います。1～4を入力して下さい");
//				break;
//		}

		System.out.println("何月の日数を知りたいですか？");
		int scanTuki = new java.util.Scanner(System.in).nextInt();
		switch(scanTuki){
			case	2:
				System.out.println(scanTuki + "月は29日あります");
				break;
			case	4:
			case	6:
			case	9:
			case	11:
				System.out.println(scanTuki + "月は30日あります");
				break;
			default :
				System.out.println(scanTuki + "月は31日あります");
				break;
		}


	}
}
