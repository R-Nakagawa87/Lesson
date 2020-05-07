package Keisho;

public class Hero extends NamedCharacter{

	String name;
	int hp;


	public Hero(String name) {
		setName(name);
		setHp(100);
	}

	public void attack(Matango m) {
		System.out.println(this.name+"の攻撃。"+10+"ダメージを与えた");
		m.hp -=10;
	}

	public String toString() {
		return "名前："+getName()+"/ HP："+getHp();
	}

	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
		if(o instanceof Hero) {
			Hero h = (Hero)o;
			if(this.name.equals(h.name)) {
				return true;
			}
		}
		return false;
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
