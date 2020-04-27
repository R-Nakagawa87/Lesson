package obj;

public class DensiMoney {

	int kingaku;
	double point;


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
