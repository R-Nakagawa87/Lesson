package sales;

public class Sales {

	//Field
	private String name;
	private int kingaku;


	//getter
	public String getName() {
		return name;
	}

	public int getKingaku() {
		return kingaku;
	}


	//Constructor
	public Sales(String name, int kingaku) {
		super();
		this.name = name;
		this.kingaku = kingaku;
	}



	public int getSouryou() {
		if(this.kingaku>=3000) {
			return 0;
		}else {
			return 500;
		}
	}


	public int getTotal() {
		return (this.kingaku + this.getSouryou());
	}


	public String toString() {
		return "名前："+name+"　購入金額："+kingaku+"円　送料："+getSouryou()+"円";
	}
}
