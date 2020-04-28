package Sukkiri;

public abstract class Monster implements Creature{

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

	//MPを定義
	private int mp;
	public int getMp() {
		return this.mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}

	//攻撃力を定義
	private int baseAttackDamege;
	public int getBaseAttackDamege() {
		return this.baseAttackDamege;
	}
	public void setBaseAttackDamege(int baseAttackDamege) {
		this.baseAttackDamege = baseAttackDamege;
	}

	public void run() {
		System.out.println(this.getName());
	}
}
