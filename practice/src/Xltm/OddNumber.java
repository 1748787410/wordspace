package Xltm;

import java.util.Random;

public class OddNumber {

	public static void main(String[] args) {
		int is = odd();
		
		System.out.println("�����ĺ��ǣ�"+is);
		
	}

	private static int odd() {
		
		int num [] = new int[9];
		int sum = 0;
		for (int i = 0; i<num.length; i++) 
		{	
			num[i] =new Random().nextInt(100);
			System.out.println("�������:"+num[i]);
			System.out.println();
			if(num[i]%2==1) 
			{
				
				sum+=i;
				
			}
			
		}
		return sum;
		
	}
}
