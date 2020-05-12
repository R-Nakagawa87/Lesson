package DB;

import java.util.ArrayList;

public class UriageCheck {

	public static void main(String[] args) {

		UriageDAO udao = new UriageDAO();
		shouhinDAO sdao = new shouhinDAO();
		ArrayList<Shouhin> slist = sdao.findAll();

		for(Shouhin s:slist) {
			System.out.println(s.getSid()+" "+s.getSname());
		}
		System.out.println();

		System.out.println("どの売り上げを見たいですか？");

		int scansid = new java.util.Scanner(System.in).nextInt();
		Uriage uri = udao.findBySid(scansid);
		
		System.out.println(uri.getHi()+" "+uri.getKosu());

	}

}
