package day04;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		int p = new Scanner(System.in).nextInt();
		for( int i = 1;i <= p; i++) {
			/*i=1 ����������ִ�е����󲽣�j=1����j<=1,����jֻ��ִ��һ�Σ���ӡ*������
			 *i=2 ����������ִ�е����󲽣�j=1����j<=2,����jֻ��ִ�����Σ���ӡ**������
			 *i=3 ����������ִ�е����󲽣�j=1����j<=3,����jֻ��ִ�����Σ���ӡ***������
			 *i=4 ����������ִ�е����󲽣�j=1����j<=4,����jֻ��ִ���ĴΣ���ӡ****������
			 *i=5 ����������ִ�е����󲽣�j=1����j<=5,����jֻ��ִ����Σ���ӡ*****������
			 *j<=i��j����������i����������
			 */
			
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	 
			for(int i = 1; i <= 9 ; i++) 
			{
				for(int j = 1; j<= i; j++) 
				{
					System.out.print(j+"*"+i+"="+i*j+" ");
				}
				System.out.println();
				
			}
		}
	}

