package cn.tedu.basic;
//����������ֵ����
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
		
		System.out.println("����M��ֵ��");
		int m = new Scanner(System.in).nextInt();
		System.out.println("����N��ֵ��");
		int n = new Scanner(System.in).nextInt();
		System.out.println("����ǰ��m="+m+",n="+n);
		
		int t = m;//�����±���ȥ����m��ֵ�������mΪ��ֵ
		m = n;//m��ֵ��t���ɿ�ֵ����n��ֵ��ֵ��m
		n = t;//n��ֵ��ֵ��m��nΪ��ֵ���ٽ�t��ֵ��n��n��m�����ֵ����
		
		System.out.println("������:m="+m+",n="+n);
		
		int M = 10;
		M = 100;
		M = 110;//���渳ֵ�����Ḳ��ǰ�渳ֵ����
		System.out.println(M);
		
		
	}
}
