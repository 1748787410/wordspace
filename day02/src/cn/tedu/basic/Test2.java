package cn.tedu.basic;
//����    ������ƴ��
import java.util.Scanner;

public class Test2 {
public static void main(String[] args) {
	String name="����";
	System.out.println("��Һã��ҽ�"+name);
	
	String number="��������";
	System.out.println("M��ȷ������"+number);
	
	int number1=new Scanner(System.in).nextInt();
	System.out.println(number1+"M��ȷ������");
	
	int number2=new Scanner(System.in).nextInt();
	System.out.println("M����"+number2+"��ȷ������");
	
	String name2 =  new Scanner(System.in).nextLine();
	System.out.println("��Һã��ҽ�"+name2);
	
	String M = new Scanner(System.in).nextLine();
	String T = new Scanner(System.in).nextLine();
	System.out.println(M+":"+T);
	
	byte c = new Scanner(System.in).nextByte();
	String d = new Scanner(System.in).nextLine();
	System.out.println(c+d);
	System.out.println(d+c);
	
 }
}
