package day03;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		
		System.out.println("ÇëÊäÈëÔ­¼Û:");
		double price = new Scanner(System.in).nextDouble();
		double p=price;
		if(p>=5000) 
		{
			p=p*0.5;
			System.out.println(p);
		}else if(p>=2000 && p<=5000) 
		{
			p=p*0.8;
			System.out.println(p);
		}else if(p>=1000 && p <=2000)
		{
			p= p*0.9;
			System.out.println(p);
		}else if(p<1000) {
			p=p;
		}
	}
}
