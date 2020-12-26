package day04;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		boolean a = true;
		if(a) 
		{
			System.out.println(1);
		}
		else 
		{
			System.out.println(2);
		}
		
		System.out.println("请输入你要查询的成绩：");
		double i = new Scanner(System.in).nextDouble();
		if(i>=100 || i<=0) {
			System.out.println("无效的查询结果");
		}else if(i<=100 && i>=90) {
			System.out.println("优秀");
		}else if(i<90 && i>=80) {
			System.out.println("良好");
		}else if(i<80 && i>=70) {
			System.out.println("中等");
		}else if(i<70 && i>=60) {
			System.out.println("及格");
		}else if(i<60) {
			System.out.println("不及格");
		}
	}
}
