package day5;

import java.util.Random;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		int i = new Scanner(System.in).nextInt();
		
		do {
			System.out.println(i);
		   }while(i>30);
		
		
		
		//while���жϺ�ִ�У�������whlie������һ�ζ���ִ��
		
		//do...while��ִ��һ�����жϣ��κ��������ִ��һ��
		int a = new Random().nextInt(100)+1;
		
		//int a = new Random().nextInt(100)���������������д��
		//����һ��д��������0-1֮���С�� double a = Math.Random()*����
//�ڶ�����С��������������Ҫǿת��int��int a = (int)Math.Random()*�����ֵ-��Сֵ��+��Сֵ
		
		
		//��ѭ������������ѭ��������Զ����
		//for��ʽ��������������������ѭ��
		//while��true��
		//����������ѭ���ĳ��ڣ�break
		//����ѭ������ͬ�㣺�Ƕ��ܴ��� �ظ�ִ�� ������
		//��ͬ�㣺1.for����ʼ������ѭ��������������������
		//������˽⿪ʼλ�ã�Ҫִ�ж��ٴΣ���ô��
		//2.while��ѭ��������
		//ֻ��Ҫ֪�����������������жϺ�ִ��
		//3.do...while��ѭ��������
		//ֻ��Ҫ֪�����������Ա�֤ѭ���� ����ִ��һ��
		do{
			//�����û����������
			int input = new Scanner(System.in).nextInt();
			//�Ƚ�
			if(input>a) 
			{
				System.out.println("̫����");
			}else if(input<a){
				System.out.println("̫С��");
			}else if(input==a)
			{
				System.out.println("̫����");
				break;
			}
		}while(a>50);
		
		
	}
}
