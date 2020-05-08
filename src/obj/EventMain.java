package obj;

public class EventMain {

	public static void main(String[] args) {

		Event ev = new Event("春の人狼大会");


		ev.add(new Sankasha("田中", 30));
		ev.add(new Sankasha("後藤", 20));
		ev.add(new Sankasha("石橋", 40));

		ev.show();

	}

}
