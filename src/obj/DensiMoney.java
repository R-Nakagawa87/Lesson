package obj;

public class DensiMoney {

	//Field
	private int kingaku;
	private double point;


	//Constructor
	public DensiMoney() {

	}

	public DensiMoney(int kingaku, double point) {
		super();
		this.kingaku = kingaku;
		this.point = point;
	}


	//getter
	public int getKingaku() {
		return kingaku;
	}

	public double getPoint() {
		return point;
	}



	void charge(int m) {
		//m分の金額が増える
		kingaku += m;
	}


	void buy(int m) {
		if(kingaku>m) {
			kingaku -= m;
			point = point + m * 0.05;
		}else {
			System.out.println("残高が" + (m - kingaku) + "足りません");
		}
	}

	void change() {
		kingaku += point;
		point -= point;
	}
}
