package day09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test6Exception {

	public static void main(String[] args) {
		method();//暴露异常
		method2();//捕获异常
		//TODO 调用了有异常的代码，要么捕获要么抛出
		method3();//抛出异常
	}
	//抛出异常：自己不管，交给调用者
	//throws  异常类型1  异常类型2

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
		System.out.println("请输入正确的数据.");
	}//还有哪些异常，哪些异常的名字是什么；
	//通用的解决方案，可以用多态
	//多态里根本不关心，具体的子类有几个，叫什么
	//多态把子类当父类来看，更通用
}

public static void method() {
		//接受用户输入的两个整数，做除法
	int i = new Scanner(System.in).nextInt();
	int j = new Scanner(System.in).nextInt();
	
	System.out.println(i/j);
	}
}
