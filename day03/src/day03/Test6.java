package day03;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		
		System.out.println("���������");
		int year = new Scanner(System.in).nextShort();
		String x = "ƽ��";
		if(year % 4 == 0 && year % 100 != 0|| year / 400 == 0) 
		{
			System.out.println(year+"������");
		}
		else 
		{
			System.out.println(year+"��"+x);
		}
			
		
	}
}
