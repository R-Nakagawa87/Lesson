package obj;

public class DenshiMoneyMain {

	public static void main(String[] args) {
		//電子マネー
		DensiMoney dm = new DensiMoney();
		dm.charge(1000);
		dm.buy(500);

		System.out.println("現在の金額：" + dm.getKingaku());
		System.out.println("現在のポイント：" + dm.getPoint());

		dm.change();

		System.out.println("現在の金額：" + dm.getKingaku());
		System.out.println("現在のポイント：" + dm.getPoint());

	}

}
