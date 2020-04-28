package Sukkiri;

public class Character implements Creature{

	//名前を定義
	String name;
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	//HPを定義
		private int hp;
		public int getHp() {
			return this.hp;
		}
		public void setHp(int hp) {
			this.hp = hp;
		}

	Sword sword;
	int baseAttackDamage;	//基礎攻撃力
	int attackDamage;	//装備使用時攻撃力

	//逃げる
	public void run() {
		System.out.println(this.name+"は逃げ出した");
	}

	//戦う
	public void attack(int dame, Monster m) {
		System.out.println(this.name + "は" + m.name+ "に攻撃した");
		m.setHp( m.getHp() - dame );
		System.out.println("敵に" + dame + "ダメージを与えた");
		System.out.println(m.name+"の残りHPは"+m.getHp());
	}

}
