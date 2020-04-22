
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
		/*
		System.out.println("数を入力してください");
		int scanNum1 = new java.util.Scanner(System.in).nextInt();
		if(scanNum1 == 10) {
			System.out.println("当たり");
		}else {
			System.out.println("はずれ");
		}
		*/

		//abcを入力したら当たり。それ以外ははずれ
		/*
		System.out.println("文字を入力してください");
		String scanStr = new java.util.Scanner(System.in).nextLine();
		if(scanStr.equals("abc")) {
			System.out.println("当たり");
		}else {
			System.out.println("はずれ");
		}
		*/

		//論理演算子を使ってif文の条件を複数使用
		/*
		System.out.println("数字を入力してください");
		int scanNum2 = new java.util.Scanner(System.in).nextInt();
		if(5<=scanNum2 && 10>=scanNum2) {
			System.out.println("当たり");
		}else {
			System.out.println("はずれ");
		}
		*/

		//5なら一等、8なら二等、それ以外ははずれ
		/*
		System.out.println("数を入力してください");
		int scanNum3 = new java.util.Scanner(System.in).nextInt();
		if(scanNum3 == 5) {
			System.out.println("一等");
		}else if(scanNum3 == 8){
			System.out.println("二等");
		}else {
			System.out.println("はずれ");
		}
		*/

		//80点以上は評価A、60点以上は評価B、59点以下は評価C
		System.out.println("点数を入力してください");
		int scanTensu = new java.util.Scanner(System.in).nextInt();
		if(scanTensu >= 80) {
			System.out.println("評価：A");
		}else if(scanTensu >= 60){
			System.out.println("評価：B");
		}else {
			System.out.println("評価：C");
		}
	}

}
