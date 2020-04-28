package obj;

public class KukuMondai {

	int num1;
	int num2;


	public KukuMondai() {
		this.num1= new java.util.Random().nextInt(9) + 1;
		this.num2= new java.util.Random().nextInt(9) + 1;
	}


	void show() {
		System.out.println(this.num1+"*"+this.num2+"=");
	}


	void check(int kotae){
		if(kotae==(this.num1*this.num2)) {
			System.out.println("正解");
		}else if(kotae==0){
			System.out.print(kotae + "が入力されたので終了します");
			System.exit(0);
		}else {
			System.out.println("不正解。正解は"+(this.num1*this.num2));
		}
		System.out.println();

	}
}
