package DB;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;

public class DbSample {

	public static void main(String[] args) {


		shouhinDAO sdao = new shouhinDAO();

		//全ての商品を検索
		ArrayList<Shouhin> slist = sdao.findAll();
		for(Shouhin s:slist) {
			System.out.println(s.getSname());
		}
		System.out.println();

		//sidから商品を1つだけ検索
		Shouhin sfind = sdao.findBySid(1);
		System.out.println(sfind.getSname());
		System.out.println();

		//商品を追加
//		Shouhin sinsert = new Shouhin(0, "バナナ", 250);
//		sdao.insert(sadd);

		//商品を変更
		Shouhin supdate = new Shouhin(6, "もも", 320);

		//商品を削除
//		sdao.delete(7);


		UriageDAO udao = new UriageDAO();

		//全ての商品を検索
		ArrayList<Uriage> ulist = udao.findAll();
		for(Uriage u:ulist) {
			System.out.println(u.getKosu()+" "+u.getHi());
		}
		System.out.println();

		//uidから商品を1つだけ検索
		Uriage ufind = udao.findBySid(1);
		System.out.println(ufind.getKosu()+" "+ufind.getHi());
		System.out.println();

		//売上を追加
//		Uriage uinsert = new Uriage(0, 1, 2, 250);
//		sdao.insert(sadd);

		//売上を変更
		Calendar c = Calendar.getInstance();
		c.set(2020, 4-1, 1);
		Date hi = new Date(c.getTimeInMillis());
		Uriage uupdate = new Uriage(5, 3, 2, hi);
		udao.update(uupdate);

		//売上sを削除
//		udao.delete(7);



//		Shouhin s = new Shouhin(7, "レモン", 120);
//		dao.update(s);
//		dao.findAll();
//

//		System.out.println(s2);
//


//		dao.delete(7);
//		ArrayList<Shouhin> list2 = dao.findAll();
//		for(Shouhin s3:list2) {
//			System.out.println(s3.getSname());
//		}

//		UriageDAO dao2 = new UriageDAO();
//
//		ArrayList<Uriage> list2 = dao2.findAll();
//		System.out.println();
//
//		for(Uriage u:list2) {
//			System.out.println(u.getKosu()+" "+u.getHi());
//		}
//		System.out.println();
//
//		Uriage u = dao2.findByUid(2);
//		System.out.println(u.getHi());
//		System.out.println();
//
//		Uriage u2 = new Uriage(6, 1, 5, null);
//		dao2.insert(u2);
	}
}
