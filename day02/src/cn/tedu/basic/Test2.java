package cn.tedu.basic;
//测试    输出结果拼接
import java.util.Scanner;

public class Test2 {
public static void main(String[] args) {
	String name="张三";
	System.out.println("大家好，我叫"+name);
	
	String number="无人生还";
	System.out.println("M国确诊人数"+number);
	
	int number1=new Scanner(System.in).nextInt();
	System.out.println(number1+"M国确诊人数");
	
	int number2=new Scanner(System.in).nextInt();
	System.out.println("M国有"+number2+"的确诊人数");
	
	String name2 =  new Scanner(System.in).nextLine();
	System.out.println("大家好，我叫"+name2);
	
	String M = new Scanner(System.in).nextLine();
	String T = new Scanner(System.in).nextLine();
	System.out.println(M+":"+T);
	
	byte c = new Scanner(System.in).nextByte();
	String d = new Scanner(System.in).nextLine();
	System.out.println(c+d);
	System.out.println(d+c);
	
 }
}
