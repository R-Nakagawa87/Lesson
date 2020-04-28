package obj;

public class Shouhin {

	String name;
	int price;

	void show() {
		System.out.println("商品名："+this.name +"  " + this.price + "円");
	}

	void showTax(String name, int price) {
		System.out.println(this.name +"の消費税：" + this.price*1/10 + "円");
	}

	void show(String name, int price) {
		System.out.println("商品名："+name + "  " + price + "円");
	}


}
