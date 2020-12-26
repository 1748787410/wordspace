package day06;

import java.util.Random;

//测试   数组的遍历
public class Test2 {

	public static void main(String[] args) {

		method();// 调用指定方法
		method2();
		int x[] = method3();// 打印随机数组
		method4(x);// 打印随机数组里的奇数
	}

	private static void method4(int[] e) {
		// 遍历e数组中的奇数
		for (int i = 0; i < e.length; i++) {
			// 数组里的数据需要过滤奇数
			if (e[i] % 2 == 1) {
				System.out.println(e[i]);
			}
		}
	}

	private static int[] method3() {
		// 动态定义数组，存数据
		int d[] = new int[5];
		// 遍历数组，获取每个数据
		for (int i = 0; i < d.length; i++) {
			d[i] = new Random().nextInt(100);
		}

		for (int i = 0; i < d.length; i++) {
			System.out.print(d[i] + ",");
			System.out.println();
		}
		return d;
	}

	private static void method2() 
	{
		int c[] = new int[] { 31, 28, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31 };

		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}

	private static void method() {
		// 创建方法
		int a[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// 2遍历数组
		/*
		 * int i = 0 从下标为0的位置开始循环 i<a.length 指下标的最大值是<长度或者 i < a.length <= a.lenght-1
		 * i++ 下标的变化规律，依次递增
		 */

		String b[] = new String[] { "1", "2", "3", "4", "5", "6" };
		System.out.println(a[0]);
		System.out.println(a[1]);// 逐一输出

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

	}
}
