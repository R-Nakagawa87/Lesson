package obj;

public class Sake extends Drink{

	//Field
	private double alc;


	//Constructor
	public Sake(String name, int amount, double alc) {
		super(name, amount);
		this.alc = alc;
	}



	public void show() {
		super.show();
		System.out.println("	アルコール度数："+this.alc+"%");
	}
}
