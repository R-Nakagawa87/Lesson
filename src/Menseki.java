
public class Menseki {

	public static void main(String[] args) {
		//半径10の円の面積を求める
		System.out.println("1.");
		int r1 = 10;
		System.out.println("半径" + r1 + "の円の面積は" + enMenseki(r1));
		System.out.println();

		//半径1～5の円の面積を求める
		System.out.println("2.");
		for(int i=1; i<=5; i++) {
			System.out.println("半径" + i + "の円の面積は" + enMenseki(i));
		}
		System.out.println();

		//半径3、8、20の円の面積を求める
		System.out.println("3.");
		int[] hankeis = {3,8,20};
		for(int hankei: hankeis) {
			System.out.println("半径" + hankei + "の円の面積は" + enMenseki(hankei));
		}
		System.out.println();

		//高さ10、底辺5の三角形の面積を求める
		System.out.println("高さ10、底辺5の三角形の面積は" + sankakuMenseki(5, 10));
		System.out.println();
	}


	//円の面積を求める
	public static double enMenseki(int hankei) {
		return (hankei * hankei * 3.14);
	}


	//三角形の面積を求める
	public static double sankakuMenseki(int width, int height) {
		return width*height/2;
	}


}
