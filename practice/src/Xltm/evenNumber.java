package Xltm;

import java.util.Random;

public class evenNumber {

	public static void main(String[] args) {
		int num[] =new int[7] ;
		int count = 0;
		for(int i = 0; i < num.length; i++) 
		{
			num[i] = new Random().nextInt(100)+1;
			System.out.println("������飺"+num[i]);
			System.out.println();
			if(num[i]%2==0) 
			{
				count++;
			}
		}
		System.out.println("������ż���ĸ����ǣ�"+count);
		
	}
}
