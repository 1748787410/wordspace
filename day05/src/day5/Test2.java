package day5;

import java.util.Random;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		int i = new Scanner(System.in).nextInt();
		
		do {
			System.out.println(i);
		   }while(i>30);
		
		
		
		//while先判断后执行，不满足whlie的条件一次都不执行
		
		//do...while先执行一次再判断，任何情况至少执行一次
		int a = new Random().nextInt(100)+1;
		
		//int a = new Random().nextInt(100)生成随机数有两种写法
		//另外一种写法会生成0-1之间的小数 double a = Math.Random()*倍数
//第二种是小数，生成整数需要强转成int：int a = (int)Math.Random()*（最大值-最小值）+最小值
		
		
		//死循环：本质是让循环条件永远成立
		//for形式：（；；）无条件即死循环
		//while（true）
		//必须设置死循环的出口：break
		//三种循环的相同点：是都能处理 重复执行 的需求
		//不同点：1.for（开始条件；循环条件；更改条件；）
		//具体的了解开始位置，要执行多少次，怎么改
		//2.while（循环条件）
		//只需要知道条件————先判断后执行
		//3.do...while（循环条件）
		//只需要知道条件，可以保证循环体 最少执行一次
		do{
			//接受用户输入的数字
			int input = new Scanner(System.in).nextInt();
			//比较
			if(input>a) 
			{
				System.out.println("太大了");
			}else if(input<a){
				System.out.println("太小了");
			}else if(input==a)
			{
				System.out.println("太对了");
				break;
			}
		}while(a>50);
		
		
	}
}
