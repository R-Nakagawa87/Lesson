package obj;

public class Seito {


	String name;
	int kokugo, sansu, shakai;
	double ave;


	void show() {
		System.out.println("テスト結果 氏名："+name);
		System.out.println("国語："+kokugo+"点 算数："+sansu+"点 社会："+shakai+"点");
		System.out.println("合計点数："+goukei());
		System.out.println("平均点数："+heikin());
	}


	int goukei() {
		int sum=0;
		sum += kokugo;
		sum+=sansu;
		sum+=shakai;
		return sum;
	}


	double heikin() {
		return goukei()/3.0;
	}

}
