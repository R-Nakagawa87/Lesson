package rental;

abstract public class Item {

	String name;
	int days;

	public Item(String name, int days) {
		this.name = name;
		this.days = days;
	}

	abstract public int getPrice();

	public String toString() {
		return "タイトル："+this.name+"　レンタル期間："+this.days+"　料金："+getPrice()+"円";
	}
}
