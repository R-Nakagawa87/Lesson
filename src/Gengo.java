
public class Gengo {

	public static void main(String[] args) {

		System.out.println("元号西暦変換");

		System.out.println("1:昭和 2:平成 3:令和");
		int gengou = new java.util.Scanner(System.in).nextInt();

		System.out.println("年を入力");
		int nen = new java.util.Scanner(System.in).nextInt();

		if(getSeireki(gengou, nen) != 0) {
		System.out.println(getGengoName(gengou) +
					nen +"年は西暦" + getSeireki(gengou, nen) + "年");
		}else {
			System.out.println("エラー");
			System.out.println("西暦を正しく入力してください");
		}

	}


	public static int getSeireki(int gengou, int nen){

		if(gengou == 1) {
			return (1925 + nen);
		}
		if(gengou == 2) {
			return (1988 + nen);
		}
		if(gengou == 3) {
			return (2018 + nen);
		}
		return 0;
	}


	public static String getGengoName(int gengou){
		String[] gengous = {"昭和","平成","令和"};
		return gengous[gengou - 1];
	}

}
