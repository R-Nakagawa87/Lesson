package Keisho;

public class Dancer extends NamedCharacter {


	public Dancer(String name) {
		setName(name);
		setHp(80);
		setBaseAttackDame(8);
	}


	public void dance() {
		System.out.println(getName()+"は情熱的に舞った");
		setBaseAttackDame(getBaseAttackDame()+5);
		setHp(getHp()+5);
		System.out.println("HPと攻撃力が5上がった");
	}


	public void attack(Matango m) {

	}


	public void run() {
		System.out.println(getName()+"は逃げ出した");
	}
}
