package Keisho;

abstract public class NamedCharacter implements Charater{

	private int hp;
	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		this.hp=hp;
	}


	private String name;
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}


	private int baseAttackDame;
	public  int getBaseAttackDame() {
		return this.baseAttackDame;
	}
	public void setBaseAttackDame(int baseAttackDame) {
		this.baseAttackDame = baseAttackDame;
	}

}
