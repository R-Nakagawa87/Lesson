package obj;

public class NetMembar extends Membar{
	@Override
	public String toString() {
//		return  "名前：" + name + "　電話番号：" + tel + "　メール：" + mail;
		return super.toString()+ "　メール：" + mail;
	}


	String mail;


	public NetMembar(String name, String tel, String mail) {
		super(name, tel);
		this.mail = mail;
	}


	void show() {
		super.show();
		System.out.println("Mail："+this.mail);
	}

}
