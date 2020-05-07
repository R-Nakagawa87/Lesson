package obj;

public class Soccer implements Sports {

	@Override
	public void shiai() {
		System.out.println("キックオフ");

	}

	@Override
	public void end() {
		System.out.println("タイムアップ");

	}

}
