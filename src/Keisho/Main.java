package Keisho;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

//		SuperHero sh = new SuperHero();
//		sh.Fly();
//		sh.land();
//		sh.run();

		Charater c = new SuperHero();
		if(c instanceof SuperHero) {
			SuperHero sh = (SuperHero)c;
		}

		Matango m1 = new Matango();

		ArrayList<Charater> chList = new ArrayList<Charater>();
		chList.add(new SuperHero("トールズ"));
		chList.add(new Hero("マサト"));

		for(Charater ch:chList) {
			ch.attack(m1);
		}
		
		Hero h1 = new Hero("トルフィン");
		System.out.println(h1);
		
		Hero h2 = new Hero("トルフィン");
		
		if(h1==h2) {
			System.out.println("同じ");
		}else {
			System.out.println("違う");
		}
		
		if(h1.equals(h2)==true) {
			System.out.println("同じ");
		}else {
			System.out.println("違う");
		}
		
	}

}
