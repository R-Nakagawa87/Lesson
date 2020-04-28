package obj;

public class Nichiji extends Hizuke{

	int ji, hun;


	public Nichiji(int month, int day, int ji, int hun) {
		super(month, day);
		this.ji=ji;
		this.hun=hun;
	}

	void showJikan() {
		System.out.println("ただ今、"+this.ji +"時"+this.hun+"分です");
	}


	void showJikan(int ji, int hun) {
		System.out.println("ただ今、"+ ji +"時"+hun+"分です");
	}


	void show(int m,int d) {
		System.out.println("ただ今、"+m + "月" + d + "日"+ this.ji +"時"+this.hun+"分です");
	}


	void show() {
		super.show();
		this.showJikan();
	}
}
