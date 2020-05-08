package Sukkiri;

public abstract class Character implements Creature{

	String name;	//名前を定義
	private int hp;	//HPを定義
	private Sword sword;	//剣を定義
	private int baseAttackDamage;	//基礎攻撃力
	private int attackDamage;	//装備使用時攻撃力

	//getter&setter
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		if(hp<0) {
			System.out.println("HPはマイナスにはできません");
			return;
		}
		this.hp = hp;
	}

	public Sword getSword() {
		return sword;
	}
	public void setSword(Sword sword) {
		this.sword = sword;
	}

	public int getBaseAttackDamage() {
		return baseAttackDamage;
	}
	public void setBaseAttackDamage(int baseAttackDamage) {
		this.baseAttackDamage = baseAttackDamage;
	}

	public int getAttackDamage() {
		return attackDamage;
	}
	public void setAttackDamage(int attackDamage) {
		this.attackDamage = attackDamage;
	}


	//逃げる
	 public abstract void run();

	//戦う
	public void attack(int dame, Monster m) {
		System.out.println(this.name + "は" + m.name+ "に攻撃した");
		m.setHp( m.getHp() - dame );
		System.out.println("敵に" + dame + "ダメージを与えた");
		System.out.println(m.name+"の残りHPは"+m.getHp());

		System.out.println("反撃を受けた");
		this.setHp(getHp()-5);
		if(this.getHp()<=0) {
			this.die();
		}
	}


	public void die() {
		System.out.println(this.getName()+"は死亡しました");
	}

}
