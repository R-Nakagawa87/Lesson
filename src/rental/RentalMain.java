package rental;

public class RentalMain {

	public static void main(String[] args) {

		Rental r = new Rental();
		r.add(new Book("ワンピース", 7));
		r.add(new Cd("パプリカ", 3));
		r.add(new Cd("Lemon", 1));

		r.show();

		System.out.println("合計："+r.getGoukei()+"円");

	}

}
