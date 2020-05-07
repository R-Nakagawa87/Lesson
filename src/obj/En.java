package obj;

public class En implements Zukei{

	int range;

	public En() {
	}

	public En(int range) {
		this.range = range;
	}

	public void menseki() {
		System.out.println("半径" + range + "の円の面積：" + (range * range * 3.14));
	}

	void menseki(int r) {
		System.out.println("半径" + r + "の円の面積：" + (r * r * 3.14));
	}

	void ensyu() {
		System.out.println("半径" + range + "の円の周の長さ：" + (2 * range * 3.14));
	}

	void ensyu(int r) {
		System.out.println("半径" + r + "の円の周の長さ：" + (2 * r * 3.14));
	}

	@Override
	public String toString() {
		return "半径：" + range;
	}

	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
		if(o instanceof En) {
			En en = (En)o;
			if(this.range==en.range) {
				return true;
			}
		}
		return false;
	}
}
