package day06;

import java.util.Random;

//����   ����ı���
public class Test2 {

	public static void main(String[] args) {

		method();// ����ָ������
		method2();
		int x[] = method3();// ��ӡ�������
		method4(x);// ��ӡ��������������
	}

	private static void method4(int[] e) {
		// ����e�����е�����
		for (int i = 0; i < e.length; i++) {
			// �������������Ҫ��������
			if (e[i] % 2 == 1) {
				System.out.println(e[i]);
			}
		}
	}

	private static int[] method3() {
		// ��̬�������飬������
		int d[] = new int[5];
		// �������飬��ȡÿ������
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
		// ��������
		int a[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// 2��������
		/*
		 * int i = 0 ���±�Ϊ0��λ�ÿ�ʼѭ�� i<a.length ָ�±�����ֵ��<���Ȼ��� i < a.length <= a.lenght-1
		 * i++ �±�ı仯���ɣ����ε���
		 */

		String b[] = new String[] { "1", "2", "3", "4", "5", "6" };
		System.out.println(a[0]);
		System.out.println(a[1]);// ��һ���

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

	}
}
