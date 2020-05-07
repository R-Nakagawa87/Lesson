package obj;

public class Baseball implements Sports {

	@Override
	public void shiai() {
		System.out.println("プレイボール");

	}

	@Override
	public void end() {
		System.out.println("ゲームセット");

	}

}
