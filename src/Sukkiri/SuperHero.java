package Sukkiri;

public class SuperHero extends Hero{

	boolean flying;


	//コンストラクタ
	public SuperHero(String name) {
		this.name = name;
		this.hp = 120;
		this.baseAttackDamage = 15;
	}


	public void Fly() {
		this.flying = true;
		System.out.println("飛び上がった");
	}


	public void land() {
		this.flying = false;
		System.out.println("着地した");
	}


	//攻撃時の行動
	public void attack(int dame, Matango m) {
		super.attack(dame, m);
		if(this.flying) {
			super.attack(dame, m);
		}
	}


	//オーバーライド
	public void run() {
		System.out.println(this.name + "は撤退した");
		System.out.println("GAME OVER");
		System.out.println("最終HPは" + this.hp +"でした");
	}
}
