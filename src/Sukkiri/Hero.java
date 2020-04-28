package Sukkiri;

public class Hero extends Character{

	//コンストラクタ
	public Hero(String name) {
		this.name = name;
		this.setHp(100);
		this.baseAttackDamage = 10;
	}

	public Hero() {
		this.name = "Mob";
		this.setHp(100);
		this.baseAttackDamage = 10;
	}

	//攻撃時の行動
	public void attack(int dame, Matango m) {
		System.out.println(this.name + "は" + m.name + m.suffix+ "に攻撃した");
		m.setHp( m.getHp()-dame);
		System.out.println("敵に" + dame + "ダメージを与えた");
		System.out.println(m.name+"の残りHPは"+m.getHp());
	}

	//眠った時の行動
	public void sleep() {
		this.setHp(100);
		System.out.println(this.name + "は眠ってHPが100まで回復した");
	}

	//座った時の行動
	public void sit(int sec) {
		this.setHp(getHp()+sec);	//座った秒数だけ回復
		System.out.println(this.name + "は" + sec + "秒座った");
		System.out.println("HPが" +sec +"ポイント回復した");
	}

	//転倒時の行動
	public void slip() {
		this.setHp(getHp()-5);
		System.out.println(this.name + "は転んだ");
		System.out.println(this.name + "に5のダメージ");
	}

	//逃走時の行動
	public void run() {
		System.out.println(this.name + "は逃げ出した");
		System.out.println("GAME OVER");
		System.out.println("最終HPは" + this.getHp() +"でした");
	}

}
