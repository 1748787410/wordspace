package day06;

import java.util.Arrays;

//测试数组工具类Arrays
public class Test3 {

	public static void main(String[] args) {
		method();//toString()
		method2();//sotr()
		method3();//copyOf
	}
	//copyOf(源数组名称,新数组长度)
	private static void method3() {
		// 1.准备原数组
		int [] a = {1,2,3,4,5};
		// 2.调用代码方法完成复制
		int b [] = Arrays.copyOf(a, 10);
		//扩容--新增的长度为初始值0
		System.out.println(Arrays.toString(b));
		
		int c [] = Arrays.copyOf(a, 2);
		//缩容--取原数组前面的长度，不足的长度自动舍弃
		System.out.println(Arrays.toString(c));
	}
	
	
	//sort()--把无序的数组进行排序
	private static void method2() {
		//定义数组
		int a[]= {95,77,99,81,1};
		//使用工具排序 
		Arrays.sort(a);
		 //打印
		System.out.println(Arrays.toString(a));
	}
	
	
	
	private static void method() {
		//1.定义数组
		//2.遍历数组并打印
		String a[] = new String [] {"one","一","1","I"};
		for(int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
		//toString()把数组里的数据变成字符串
		
		}
		System.out.println(Arrays.toString(a));
	}
}
