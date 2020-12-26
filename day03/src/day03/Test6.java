package day03;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		
		System.out.println("请输入年号");
		int year = new Scanner(System.in).nextShort();
		String x = "平年";
		if(year % 4 == 0 && year % 100 != 0|| year / 400 == 0) 
		{
			System.out.println(year+"是闰年");
		}
		else 
		{
			System.out.println(year+"是"+x);
		}
			
		
	}
}
