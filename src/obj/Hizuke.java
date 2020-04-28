package obj;

public class Hizuke {

	int month, day;

	public Hizuke(int month,int day) {
		this.month = month;
		this.day = day;
	}


	void show() {
		System.out.println(this.month + "月" + this.day + "日");
	}


	void show(int m, int d) {
		System.out.println(m + "月" + d + "日");
	}

}
