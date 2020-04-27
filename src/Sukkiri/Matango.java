package Sukkiri;

public class Matango {

	String name = "お化けキノコ";
	int hp;	//HPの宣言
	final int LEVEL = 10;	//レベルの宣言
	char suffix;

	public void run() {
		System.out.println(this.name + this.suffix + "は逃げ出した");
	}
}
