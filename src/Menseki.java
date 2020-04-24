
public class Menseki {

	public static void main(String[] args) {
		System.out.println("1.");
		enMenseki(10);
		System.out.println();

		System.out.println("2.");
		for(int i=1; i<=5; i++) {
			enMenseki(i);
		}
		System.out.println();

		System.out.println("3.");
		int[] hankeis = {3,8,20};
		for(int hankei: hankeis) {
			enMenseki(hankei);
		}
		System.out.println();
	}


	//円の面積を求める
	public static void enMenseki(int hankei) {
		double s = hankei * hankei * 3.14;
		System.out.println("半径" + hankei + "の円の面積は" + s);
	}

}
