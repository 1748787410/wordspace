package day03;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		System.out.println("������������أ�ǧ�ˣ���");
		int y = new Scanner(System.in).nextInt();
		System.out.println("�����������ߣ��ף���");
		double x = new Scanner(System.in).nextDouble();
		
		double BIM = y/(x*x);
		
		if(BIM<18.5) 
		{
			System.out.println("���ع���");
		}else if(BIM>=18 && BIM<24) {
			System.out.println("������Χ");
		}else if(BIM>=24 && BIM<27) {
			System.out.println("����");
		}else if(BIM>=27 && BIM<30) {
			System.out.println("��ȷ���");
		}else if(BIM>=30 && BIM<35) {
			System.out.println("�жȷ���");
		}else if(BIM>=35) {
			System.out.println("�ضȷ���");
		}
		
	}
}
