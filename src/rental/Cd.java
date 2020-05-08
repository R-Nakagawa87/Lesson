package rental;

public class Cd extends Item{

	public Cd(String name, int days) {
		super(name, days)	;
	}

	@Override
	//1日目300円、2日目以降は100円ずつ加算
	public int getPrice() {
		return 200+100*this.getDays();
	}



}
