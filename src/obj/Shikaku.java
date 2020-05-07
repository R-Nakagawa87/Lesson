package obj;

public class Shikaku implements Zukei{

	@Override
	public String toString() {
		return "幅：" + haba + "　高さ：" + takasa;
	}

	int haba;
	int takasa;


	public Shikaku(int takasa, int haba) {
		this.haba = haba;
		this.takasa = takasa;
	}

	public void menseki() {
		System.out.println("幅が"+haba+"、高さが"+takasa+"の四角形の面積："+(haba*takasa));
	}
}
