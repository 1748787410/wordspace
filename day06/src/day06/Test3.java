package day06;

import java.util.Arrays;

//�������鹤����Arrays
public class Test3 {

	public static void main(String[] args) {
		method();//toString()
		method2();//sotr()
		method3();//copyOf
	}
	//copyOf(Դ��������,�����鳤��)
	private static void method3() {
		// 1.׼��ԭ����
		int [] a = {1,2,3,4,5};
		// 2.���ô��뷽����ɸ���
		int b [] = Arrays.copyOf(a, 10);
		//����--�����ĳ���Ϊ��ʼֵ0
		System.out.println(Arrays.toString(b));
		
		int c [] = Arrays.copyOf(a, 2);
		//����--ȡԭ����ǰ��ĳ��ȣ�����ĳ����Զ�����
		System.out.println(Arrays.toString(c));
	}
	
	
	//sort()--������������������
	private static void method2() {
		//��������
		int a[]= {95,77,99,81,1};
		//ʹ�ù������� 
		Arrays.sort(a);
		 //��ӡ
		System.out.println(Arrays.toString(a));
	}
	
	
	
	private static void method() {
		//1.��������
		//2.�������鲢��ӡ
		String a[] = new String [] {"one","һ","1","I"};
		for(int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
		//toString()������������ݱ���ַ���
		
		}
		System.out.println(Arrays.toString(a));
	}
}
