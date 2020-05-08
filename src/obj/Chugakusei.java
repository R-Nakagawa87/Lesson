package obj;

public class Chugakusei extends Seito{

	//Field
	private int eigo;


	//Constructor
	public Chugakusei(String name,int kokugo,int sansu,int shakai,int eigo){
		super(name,kokugo,sansu,shakai);
		this.eigo = eigo;
	}



	public void show() {
		System.out.println("テスト結果 氏名："+this.getName());
		System.out.println("国語："+this.getKokugo()+"点 算数："+
				this.getSansu()+"点 社会："+this.getShakai()+"点 英語："+this.eigo);
		System.out.println();
	}


	int goukei() {
		return super.goukei()+this.eigo;
	}
}


