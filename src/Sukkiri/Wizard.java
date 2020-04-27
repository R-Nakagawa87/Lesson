package Sukkiri;

public class Wizard {

	String name;
	int hp;


	//コンストラクタ
	public Wizard(String name) {
		this.name = name;
		this.hp = 80;
	}

	public void heal(Hero h, int healPoint) {
		h.hp += healPoint;
		System.out.println(this.name + "は" + h.name + "を" + healPoint + "回復した");
	}
}
