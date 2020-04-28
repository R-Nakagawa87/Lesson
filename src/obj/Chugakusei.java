package obj;

public class Chugakusei extends Seito{

	int eigo;


	public Chugakusei(String name,int kokugo,int sansu,int shakai,int eigo){
		super(name,kokugo,sansu,shakai);
		this.eigo = eigo;
	}


	void show() {
		System.out.println("テスト結果 氏名："+this.name);
		System.out.println("国語："+this.kokugo+"点 算数："+
				this.sansu+"点 社会："+this.shakai+"点 英語："+this.eigo);
		System.out.println();
	}


	int goukei() {
		int sum=0;
		sum += this.kokugo;
		sum+= this.sansu;
		sum+= this.shakai;
		sum+= this.eigo;
		return sum;
	}
}


