package obj;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Event {

	//field
	private String name;
	private Date hi = new Date();


	//constructor
	public Event(String name) {
		super();
		this.name = name;
	}



	SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");


	ArrayList<Sankasha> sankaList = new ArrayList<Sankasha>();

	public void add(Sankasha s) {
		sankaList.add(s);
	}


	public void show() {
		System.out.println("イベント名："+this.name+"\n"+sdf.format(hi)+"\n参加者：");

		for(Sankasha s:sankaList) {
			System.out.println(s.getName()+"	"+s.getAge()+"歳");
		}
	}

}
