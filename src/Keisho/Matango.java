package Keisho;

public class Matango{

	String name;
	int hp;
	final int LEVEL = 10;	//レベルの宣言
	char suffix;


	public void attack() {
		System.out.println(this.name + this.suffix + "の攻撃");
	}


	public void run() {
		System.out.println(this.name + this.suffix + "は一目散に逃げ出した");
	}
}
