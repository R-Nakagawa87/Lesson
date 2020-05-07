package obj;


public class Sankaku implements Zukei{

	int width;
	int hight;


	public Sankaku(int width, int hight) {
		this.width = width;
		this.hight = hight;
	}


	public Sankaku() {
		this(10,10);
	}


	public void menseki() {
		System.out.println("三角形の面積" + this.width * this.hight / 2);
	}

	void menseki(int w, int h) {
		System.out.println("三角形の面積" + w * h / 2);
	}


	@Override
	public String toString() {
		return "底辺：" + width + "　高さ" + hight;
	}


}
