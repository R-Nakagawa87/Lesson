package Keisho;

public class SuperHero extends Hero{

	public SuperHero() {
		super("Mob");
		this.hp = 120;
	}

	boolean flying;

	public void Fly() {
		this.flying = true;
		System.out.println("飛び上がった");
	}


	public void land() {
		this.flying = false;
		System.out.println("着地した");
	}


	public void attack(Matango m) {
		super.attack(m);
		if(this.flying) {
			super.attack(m);
		}
	}


	//オーバーライド
	public void run() {
		System.out.println(this.name + "は撤退した");
		System.out.println("GAME OVER");
		System.out.println("最終HPは" + this.hp +"でした");
	}
}
