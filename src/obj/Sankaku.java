package obj;

public class Sankaku {

	int width;
	int hight;


	public Sankaku(int width, int hight) {
		this.width = width;
		this.hight = hight;
	}


	public Sankaku() {
		this(10,10);
	}


	void menseki() {
		System.out.println("三角形の面積" + this.width * this.hight / 2);
	}

	void menseki(int w, int h) {
		System.out.println("三角形の面積" + w * h / 2);
	}
}
