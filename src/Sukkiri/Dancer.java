package Sukkiri;

public class Dancer extends Character {


	public Dancer(String name) {
		this.name = name;
		this.hp = 100;
		this.baseAttackDamage = 7;
	}


	public void dance() {
		System.out.println(this.name+"は情熱的に舞った");
		this.baseAttackDamage += 5;
		this.hp += 5;
		System.out.println("HPと攻撃力が5上がった");
	}

}
