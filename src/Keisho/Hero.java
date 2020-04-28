package Keisho;

public class Hero{

	String name;
	int hp;


	public Hero(String name) {
		this.name = name;
		this.hp = 100;
	}

	public void attack(Matango m) {
		System.out.println(this.name+"の攻撃。"+10+"ダメージを与えた");
		m.hp -=10;
	}

	//眠った時の行動
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は眠ってHPが100まで回復した");
	}

	//座った時の行動
	public void sit(int sec) {
		this.hp += sec;	//座った秒数だけ回復
		System.out.println(this.name + "は" + sec + "秒座った");
		System.out.println("HPが" +sec +"ポイント回復した");
	}

	//転倒時の行動
	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ");
		System.out.println(this.name + "に5のダメージ");
	}

	//逃走時の行動
	public void run() {
		System.out.println(this.name + "は逃げ出した");
		System.out.println("GAME OVER");
		System.out.println("最終HPは" + this.hp +"でした");
	}

}
