package obj;

public class TeamMain {

	public static void main(String[] args) {

		Team t1 = new Team("ロアッソ熊本", 5, 2);

		System.out.println(t1.getName()+ "　" + t1.getWin() + "勝" + t1.getLose() + "敗");

	}

}
