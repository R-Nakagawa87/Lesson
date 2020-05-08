package rental;

abstract public class Item {

	//Field
	private String name;
	private int days;

	//getter&setter
	public String getName() {
		return name;
	}

	public int getDays() {
		return days;
	}


	//Constructor
	public Item(String name, int days) {
		this.name = name;
		this.days = days;
	}



	abstract public int getPrice();

	public String toString() {
		return "タイトル："+this.name+"　レンタル期間："+this.days+"　料金："+getPrice()+"円";
	}
}
