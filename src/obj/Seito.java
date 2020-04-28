package obj;

public class Seito {


	String name;
	int kokugo, sansu, shakai;
	double ave;


	void show() {
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
