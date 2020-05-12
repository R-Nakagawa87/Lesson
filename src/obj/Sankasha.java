package obj;

public class Sankasha {

	//field
	private String name;
	private int age;


	//constructor
	public Sankasha(String name, int age) throws SankashaException{
		if(age<0) {
			throw new SankashaException("年齢が適切ではありません："+age);
		}

		if(name.equals("")) {
			throw new SankashaException("名前が適切ではありません："+name);
		}

		this.name = name;
		this.age = age;
	}


	//getter&setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


}
