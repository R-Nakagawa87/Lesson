package obj;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateSample {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		System.out.println(start);

		Date d = new Date();	//現在日時

		Date d2 = new Date(1588913397835L);	//相対的な日時指定

		System.out.println(d);
		System.out.println(d.getTime());
		System.out.println(d2);

		Calendar c= Calendar.getInstance();
		c.set(2020, 5-1, 8);	//表示したい月は「-1」して表すこと
		Date d3 = c.getTime();
		System.out.println(d3);

		c.setTime(d);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"年"+month+"月"+day+"日");

		c.set(2020, 6-1, 1);
		Date d4 = c.getTime();
		System.out.println(d4);

		SimpleDateFormat f1 = new SimpleDateFormat("yyyy.MM.dd");
		String s1 = f1.format(d4);
		System.out.println(s1);

		SimpleDateFormat f2 = new SimpleDateFormat("HH時mm分ss秒");
		System.out.println(f2.format(d));





	}

}
