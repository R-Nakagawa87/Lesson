package Sukkiri;

public class Matango extends Monster{

	String name;
	final int LEVEL = 10;	//レベルの宣言
	char suffix;
	int baseAttackDamage;

	public Matango(char suffix){
		this.suffix = suffix;

	}


	public void attack(Character c) {
		System.out.println(this.name + this.suffix + "の攻撃");
		System.out.println(baseAttackDamage+"のダメージ");
		c.setHp(getHp()-baseAttackDamage);
	}


	public void run() {
		System.out.println(this.name + this.suffix + "は一目散に逃げ出した");
	}
}
