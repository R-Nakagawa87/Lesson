package Sukkiri;

public class Wizard extends Character{


	//コンストラクタ
	public Wizard(String name) {
		this.name = name;
		setHp(80);
	}


	//ヒール
	public void heal(Hero h, int healPoint) {
		setHp(getHp()+healPoint);
		System.out.println(this.name + "は" + h.name + "を" + healPoint + "回復した");
	}


	public void run() {
		System.out.println(this.name+"は逃げ出した");
	}
}
