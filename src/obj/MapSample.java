package obj;

import java.util.HashMap;
import java.util.Map;

public class MapSample {

	public static void main(String[] args) {

		Map<String, Integer> prefs = new HashMap<>();

		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 181);

		int tokyo = prefs.get("東京都");

		System.out.println("東京都の人口："+tokyo);

		prefs.remove("京都府");

		int kumamoto = prefs.put("熊本県", 182);

		System.out.println("熊本県の人口："+kumamoto);
		
		
		for(String key:prefs.keySet()) {
			int value = prefs.get(key);
			System.out.println(key+"の人口："+value);
					
		}




	}

}
