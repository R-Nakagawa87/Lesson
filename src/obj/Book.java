package obj;

public class Book extends Shouhin{

	String author;

	public Book(String name,int price,String author) {
		this.name = name;
		this.price = price;
		this.author = author;
	}


	void show() {
		super.show(this.name,this.price);
		System.out.println("著者："+this.author+"");
	}
}
