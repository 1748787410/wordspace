package day09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test6Exception {

	public static void main(String[] args) {
		method();//��¶�쳣
		method2();//�����쳣
		//TODO ���������쳣�Ĵ��룬Ҫô����Ҫô�׳�
		method3();//�׳��쳣
	}
	//�׳��쳣���Լ����ܣ�����������
	//throws  �쳣����1  �쳣����2

private static void method3() 
		throws InputMismatchException{
		// TODO Auto-generated method stub
	int i = new Scanner(System.in).nextInt();
	int j = new Scanner(System.in).nextInt();
	
	System.out.println(i/j);
	}

private static void method2() {
		// TODO Auto-generated method stub
	try {
	int i = new Scanner(System.in).nextInt();
	int j = new Scanner(System.in).nextInt();
	    
	System.out.println(i/j);
	}catch(Exception i) {
		System.out.println("��������ȷ������.");
	}//������Щ�쳣����Щ�쳣��������ʲô��
	//ͨ�õĽ�������������ö�̬
	//��̬����������ģ�����������м�������ʲô
	//��̬�����൱������������ͨ��
}

public static void method() {
		//�����û����������������������
	int i = new Scanner(System.in).nextInt();
	int j = new Scanner(System.in).nextInt();
	
	System.out.println(i/j);
	}
}