package day03;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		System.out.println("请输入你的体重（千克）：");
		int y = new Scanner(System.in).nextInt();
		System.out.println("请输入你的身高（米）：");
		double x = new Scanner(System.in).nextDouble();
		
		double BIM = y/(x*x);
		
		if(BIM<18.5) 
		{
			System.out.println("体重过轻");
		}else if(BIM>=18 && BIM<24) {
			System.out.println("正常范围");
		}else if(BIM>=24 && BIM<27) {
			System.out.println("过重");
		}else if(BIM>=27 && BIM<30) {
			System.out.println("轻度肥胖");
		}else if(BIM>=30 && BIM<35) {
			System.out.println("中度肥胖");
		}else if(BIM>=35) {
			System.out.println("重度肥胖");
		}
		
	}
}
