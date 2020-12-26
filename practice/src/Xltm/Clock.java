package Xltm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Clock {

	public static void main(String[] args) throws ParseException {
		
		System.out.println("输入日期：");
		String time = new Scanner(System.in).next();
		SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd");
		Date d = a.parse(time);
		Calendar cal = Calendar.getInstance();//获取时间
		cal.setTime(d);
		
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd  EEEE");
		
		for(int W = 1; W <= 7; W++) {
			cal.add(cal.DATE,1);
			d=cal.getTime();
			String e = f.format(d);
			System.out.println(e);
		}
		/*int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);*/
	}
}
