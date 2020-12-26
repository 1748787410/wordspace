package cn.tedu.basic;
//测试两个数值交换
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		int c = a;
		a = b;
		b = c;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("输入M的值：");
		int m = new Scanner(System.in).nextInt();
		System.out.println("输入N的值：");
		int n = new Scanner(System.in).nextInt();
		System.out.println("交换前：m="+m+",n="+n);
		
		int t = m;//定义新变量去储存m的值，储存后m为空值
		m = n;//m赋值给t后变成空值，将n的值赋值给m
		n = t;//n的值赋值给m后，n为空值，再将t赋值给n；n，m完成数值交换
		
		System.out.println("交换后:m="+m+",n="+n);
		
		int M = 10;
		M = 100;
		M = 110;//后面赋值的数会覆盖前面赋值的数
		System.out.println(M);
		
		
	}
}
