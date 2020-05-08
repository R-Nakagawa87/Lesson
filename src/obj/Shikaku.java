package obj;

public class Shikaku implements Zukei{

	private int haba;
	private int takasa;


	public int getHaba() {
		return haba;
	}
	public void setHaba(int haba) {
		this.haba = haba;
	}

	public int getTakasa() {
		return takasa;
	}
	public void setTakasa(int takasa) {
		this.takasa = takasa;
	}



	@Override
	public String toString() {
		return "幅：" + haba + "　高さ：" + takasa;
	}



	public Shikaku(int takasa, int haba) {
		this.haba = haba;
		this.takasa = takasa;
	}

	public void menseki() {
		System.out.println("幅が"+haba+"、高さが"+takasa+"の四角形の面積："+(haba*takasa));
	}
}
