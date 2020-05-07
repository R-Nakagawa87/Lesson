package obj;

public class Membar {

	@Override
	public String toString() {
		return "氏名："+this.name+"　電話番号："+this.tel;
	}


	String name;
	String tel;


	public Membar(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}


	void show() {
		System.out.println("氏名："+this.name+"　電話番号："+this.tel);
	}

}
