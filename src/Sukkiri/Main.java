package Sukkiri;

public class Main {

	public static void main(String[] args) {
		//剣生成
		Sword s1 = new Sword();
		s1.name = "日輪刀";
		s1.damage = 10;

		//勇者1生成
		Hero h1 = new Hero("ミナト");
		h1.sword = s1;
		h1.attackDamage = h1.baseAttackDamage + h1.sword.damage;

		//勇者2生成
		Hero h2 = new Hero("アサカ");
		h2.sword = s1;
		h2.attackDamage = h2.baseAttackDamage + h2.sword.damage;

		//魔法使い1生成
		Wizard w1 = new Wizard("スガワラ");

		//スーパー勇者生成
		SuperHero sh = new SuperHero("タケル");
		sh.sword = s1;
		sh.attackDamage = sh.baseAttackDamage + sh.sword.damage;

		//モンスター1生成
		Matango m1 = new Matango();
		m1.hp = 50 ;
		m1.suffix = 'A';

		//モンスター2生成
		Matango m2 = new Matango();
		m2.hp = 50 ;
		m2.suffix = 'B';

		System.out.println("勇者" + h1.name + "が誕生しました");
		System.out.println(h1.name + "の現在の武器：" + h1.sword.name);
		System.out.println(h1.name + "の攻撃力：" +(h1.attackDamage + h1.sword.damage));
		System.out.println();

		System.out.println("勇者" + h2.name + "が誕生しました");
		System.out.println(h2.name + "の現在の武器：" + h2.sword.name);
		System.out.println(h2.name + "の攻撃力：" + (h2.attackDamage + h2.sword.damage));
		System.out.println();

		System.out.println("魔法使い" + w1.name + "が誕生しました");
		System.out.println();

		System.out.println("スーパー勇者" + sh.name + "が誕生しました");
		System.out.println(sh.name + "の現在の武器：" + sh.sword.name);
		System.out.println(sh.name + "の攻撃力：" + (sh.attackDamage +sh.sword.damage));
		System.out.println();

		h1.attack(h1.attackDamage, m1);
		h1.sit(5);
		h1.slip();
		h1.sleep();
		w1.heal(h1, 10);
		m1.run();
		m2.run();
		h1.run();
	}

}
