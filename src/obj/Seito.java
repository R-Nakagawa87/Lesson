package obj;

public class Seito {

	//Field
	private String name;
	private int kokugo, sansu, shakai;
	private double ave;

	//Constructor
	public Seito() {
		this.name=name;
		this.kokugo=kokugo;
		this.sansu=sansu;
		this.shakai=shakai;
	}



	public String getName() {
		return name;
	}



	public int getKokugo() {
		return kokugo;
	}



	public int getSansu() {
		return sansu;
	}



	public int getShakai() {
		return shakai;
	}



	public Seito(String name,int kokugo,int sansu,int shakai) {
		this.name=name;
		this.kokugo=kokugo;
		this.sansu=sansu;
		this.shakai=shakai;
	}

	public void show() {
		System.out.println("テスト結果 氏名："+this.name);
		System.out.println("国語："+this.kokugo+"点 算数："+this.sansu+"点 社会："+this.shakai+"点");
		System.out.println("合計点数："+this.goukei());
		System.out.println("平均点数："+this.heikin());
		System.out.println();
	}


	int goukei() {
		int sum=0;
		sum += this.kokugo;
		sum+= this.sansu;
		sum+= this.shakai;
		return sum;
	}


	double heikin() {
		return this.goukei()/3.0;
	}

}
