package Sukkiri;

public class Matango extends Monster{

	String name = "お化けキノコ";
	final int LEVEL = 10;	//レベルの宣言
	char suffix;

	
	public void attack() {
		System.out.println(this.name + this.suffix + "は逃げ出した");
	}
	
	
	public void run() {
		System.out.println(this.name + this.suffix + "は逃げ出した");
	}
}
