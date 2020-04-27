package obj;

public class KujiChecker {

	int kingaku;


	void check(Kuji k) {
			if(k.bango == 123456) {
				k.kekka = "1等";
				kingaku += 100000;
			} else if(k.bango%100 == 12) {
				k.kekka = "2等";
				kingaku += 1000;
			} else
				k.kekka = "はずれ";
				kingaku += 0;
	}
}
