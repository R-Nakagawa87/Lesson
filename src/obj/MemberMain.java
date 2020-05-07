package obj;

public class MemberMain {

	public static void main(String[] args) {

		Membar m = new Membar("田中", "090-9548-6541");
//		m.show();
		System.out.println(m);
		System.out.println();


		En e = new En();
		e.range = 10;
		e.menseki();
		System.out.println();


		NetMembar nm = new NetMembar("笹原", "080-9631-7410", "mailmail@gmail.com");
//		nm.show();
		System.out.println(nm);
		System.out.println();
	}

}
