package Xltm;

import java.util.Random;
import java.util.Scanner;

public class Mora{
    
	public static void main(String[] args) {
		int player = 0;
		int enemy = 0;
		for(int number = 1; number <= 50; number++) 
		{
		System.out.println("�������ֲ�ȭ��(1��ʯͷ   2������    3����)");
		int me = new Scanner(System.in).nextInt();
		String we = null ;
		int computer = new Random().nextInt(3)+1;
		String co = null;
		
		switch(me) 
		{
		  case 1:
			  we = "ʯͷ";
			  System.out.println("ʯͷ");
			  break;
			  
		  case 2:
			  we = "����";
			  System.out.println("����");
			  break;
			  
		  case 3:
			  we = "��";
			  System.out.println("��");
			  break;
		}
		
		switch(computer) 
		{
		  case 1:
			  co = "ʯͷ";
			  System.out.println("ʯͷ");
			  break;
			  
		  case 2:
			  co = "����";
			  System.out.println("����");
			  break ;
			  
		  case 3:
			  co = "��";
			  System.out.println("��");
			  break;
			  
		}
		
		
		if(me ==  1 && computer == 2 || me == 2 && computer == 3 ||
				me == 3 && computer == 1) 
		{   
			System.out.println("�������"+we+","+"���Գ�����"+co+",");
			System.out.println("��Ӯ��");
			player++;
			System.out.println("�㵱ǰ�ķ���Ϊ��"+player);
			
		}
		else if(me == 2 && computer == 1 || me == 3 && computer == 2 ||
				me == 1 && computer == 3)
		{   
			System.out.println("�������"+we+","+"���Գ�����"+co+",");
			System.out.println("������");
			enemy++;
			System.out.println("�Է���ǰ����Ϊ��"+enemy);
			
		}
		else if(me == computer)
		{
			System.out.println("�������"+we+","+"���Գ�����"+co+",");
			System.out.println("ƽ��");
		}
		else 
			{
				System.out.println("����ֵ������Ч�Ľ��");
			}
	  }
  }
}