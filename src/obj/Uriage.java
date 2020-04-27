package obj;

public class Uriage extends Shouhin{

	Shouhin shou;
	int kosu;

	void show(int kosu) {
		System.out.println(shou.name + "(" + shou.price + "円)が" + kosu + "個売れた");
	}


	void showUriage(int kosu) {
		System.out.println(shou.name + "は" + (shou.price * kosu) + "円売れた");
	}
}
