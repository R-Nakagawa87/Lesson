package DB;

import java.util.ArrayList;

public class MemberMain {

	public static void main(String[] args) {

		MemberDAO mdao = new MemberDAO();

		ArrayList<Member> mlist = new ArrayList<>();
		mlist = mdao.findAll();

		//全表示
		for(Member m:mlist) {
			System.out.println(m.getMid()+" "+m.getName());
		}
		System.out.println();


		//midで検索表示
		Member mfind = new Member();
		mfind = mdao.findByMid(1);
		System.out.println(mfind.getAdr());
		System.out.println();



	}

}
