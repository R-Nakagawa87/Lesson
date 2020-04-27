package Sukkiri;

public class Hero {

	String name;	//名前の宣言
	int hp;	//HPの宣言
	Sword sword;
	int baseAttackDamage;	//基礎攻撃力
	int attackDamage;	//装備使用時攻撃力


	//コンストラクタ
	public Hero(String name) {
		this.name = name;
		this.hp = 100;
		this.baseAttackDamage = 10;
	}

	public Hero() {
		this.name = "Mob";
		this.hp = 100;
	}

	//攻撃時の行動
	public void attack(int dame, Matango m) {
		System.out.println(this.name + "は" + m.name + m.suffix+ "に攻撃した");
		m.hp -= dame;
		System.out.println("敵に" + dame + "ダメージを与えた");
		System.out.println(m.name+"の残りHPは"+m.hp);
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
