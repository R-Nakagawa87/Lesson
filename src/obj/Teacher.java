package obj;

public class Teacher {

	String name;
	int nen;
	int kumi;


	public Teacher(String name) {
		this(name,0,0) ;
	}


	public Teacher(String name,int nen,int kumi) {
		this.name = name;
		this.nen = nen;
		this.kumi = kumi;
	}


	void show() {
		if((nen>0)&&(kumi>0)) {
			System.out.println(this.name+"先生 "+nen+"年"+kumi+"組担任");
		}else {
			System.out.println(this.name+"先生 担任無し");
		}
		System.out.println();
	}
}
