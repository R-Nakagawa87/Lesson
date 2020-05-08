package Sukkiri;

public class Main {

	public static void main(String[] args) {
		//剣生成
		Sword s1 = new Sword("日輪刀",10);
		Sword s2 = new Sword("ニワトコの杖",10);

		//勇者1生成
		Hero h1 = new Hero("ミナト");
		h1.setSword(s1);
		h1.setAttackDamage(h1.getBaseAttackDamage() + h1.getSword().damage);

		//勇者2生成
		Hero h2 = new Hero("アサカ");
		h2.setSword(s1);
		h2.setAttackDamage(h2.getBaseAttackDamage() + h2.getSword().damage);

		//魔法使い1生成
		Wizard w1 = new Wizard("スガワラ");
		w1.setSword(s2);
		w1.setAttackDamage(w1.getBaseAttackDamage() + w1.getSword().damage);

		//スーパー勇者生成
		SuperHero sh = new SuperHero("タケル");
		sh.setSword(s1);
		sh.setAttackDamage(sh.getBaseAttackDamage() + sh.getSword().damage);

		//モンスター1生成
		Matango m1 = new Matango('A');
		m1.setHp(50) ;
		m1.suffix = 'A';

		//モンスター2生成
		Matango m2 = new Matango('B');
		m2.setHp(50);
		m2.suffix = 'B';

		System.out.println("勇者" + h1.name + "が誕生しました");
		System.out.println(h1.name + "の現在の武器：" + h1.getSword().name);
		System.out.println(h1.name + "の攻撃力：" +(h1.getAttackDamage() + h1.getSword().damage));
		System.out.println();

		System.out.println("勇者" + h2.name + "が誕生しました");
		System.out.println(h2.name + "の現在の武器：" + h2.getSword().name);
		System.out.println(h2.name + "の攻撃力：" + (h2.getAttackDamage()  + h2.getSword().damage));
		System.out.println();

		System.out.println("魔法使い" + w1.name + "が誕生しました");
		System.out.println(w1.name + "の現在の武器：" + w1.getSword().name);
		System.out.println(w1.name + "の攻撃力：" + (w1.getAttackDamage()  + w1.getSword().damage));
		System.out.println();

		System.out.println("スーパー勇者" + sh.name + "が誕生しました");
		System.out.println(sh.name + "の現在の武器：" + sh.getSword().name);
		System.out.println(sh.name + "の攻撃力：" + (sh.getAttackDamage()  +sh.getSword().damage));
		System.out.println();


//		h1.setMoney(h1.getMoney()+500);
//		h2.setMoney(h2.getMoney()+800);
//		System.out.println(h1.getMoney());
//		System.out.println(h2.getMoney());

		Hero.setRandomMoney();
		System.out.println("Heroの所持金："+Hero.money+"円");

		h1.attack(h1.getAttackDamage() , m1);
		h1.sit(5);
		h1.slip();
		h1.sleep();
		w1.heal(h1, 10);
		m1.run();
		m2.run();
		h1.run();

	}

}
