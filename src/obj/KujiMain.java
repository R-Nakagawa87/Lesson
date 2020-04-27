package obj;

public class KujiMain {

	public static void main(String[] args) {

		KujiChecker kc = new KujiChecker();
		Kuji kj = new Kuji();


		kj.bango = 123456;
		kc.check(kj);
		kj.show();
		System.out.println("現在の金額："+kc.kingaku);

		kj.bango = 356412;
		kc.check(kj);
		kj.show();
		System.out.println("現在の金額："+kc.kingaku);

		kj.bango = 169546;
		kc.check(kj);
		kj.show();
		System.out.println("現在の金額："+kc.kingaku);
		}

}
