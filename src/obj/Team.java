package obj;

public class Team {

	//field
	private String name;
	private int win;
	private int lose;

	//constructor
	public Team() {
	}

	public Team(String name, int win, int lose) {
		super();
		this.name = name;
		this.win = win;
		this.lose = lose;
	}

	//getter&setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}

	public int getLose() {
		return lose;
	}
	public void setLose(int lose) {
		this.lose = lose;
	}


	@Override
	public String toString() {
		return name + "　" + win + "勝" + lose + "敗";
	}


}


class Player{

	//Field
	private String name;


	//Constructor
	public Player() {

	}


	//Getter&Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}
