package Sukkiri;

public class Wizard extends Character{


	//コンストラクタ
	public Wizard(String name) {
		this.name = name;
		this.hp = 80;
	}


	//ヒール
	public void heal(Hero h, int healPoint) {
		h.hp += healPoint;
		System.out.println(this.name + "は" + h.name + "を" + healPoint + "回復した");
	}
}
