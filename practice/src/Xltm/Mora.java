package Xltm;

import java.util.Random;
import java.util.Scanner;

public class Mora{
    
	public static void main(String[] args) {
		int player = 0;
		int enemy = 0;
		for(int number = 1; number <= 50; number++) 
		{
		System.out.println("输入数字猜拳：(1：石头   2：剪刀    3：布)");
		int me = new Scanner(System.in).nextInt();
		String we = null ;
		int computer = new Random().nextInt(3)+1;
		String co = null;
		
		switch(me) 
		{
		  case 1:
			  we = "石头";
			  System.out.println("石头");
			  break;
			  
		  case 2:
			  we = "剪刀";
			  System.out.println("剪刀");
			  break;
			  
		  case 3:
			  we = "布";
			  System.out.println("布");
			  break;
		}
		
		switch(computer) 
		{
		  case 1:
			  co = "石头";
			  System.out.println("石头");
			  break;
			  
		  case 2:
			  co = "剪刀";
			  System.out.println("剪刀");
			  break ;
			  
		  case 3:
			  co = "布";
			  System.out.println("布");
			  break;
			  
		}
		
		
		if(me ==  1 && computer == 2 || me == 2 && computer == 3 ||
				me == 3 && computer == 1) 
		{   
			System.out.println("你出的是"+we+","+"电脑出的是"+co+",");
			System.out.println("你赢了");
			player++;
			System.out.println("你当前的分数为："+player);
			
		}
		else if(me == 2 && computer == 1 || me == 3 && computer == 2 ||
				me == 1 && computer == 3)
		{   
			System.out.println("你出的是"+we+","+"电脑出的是"+co+",");
			System.out.println("你输了");
			enemy++;
			System.out.println("对方当前分数为："+enemy);
			
		}
		else if(me == computer)
		{
			System.out.println("你出的是"+we+","+"电脑出的是"+co+",");
			System.out.println("平局");
		}
		else 
			{
				System.out.println("输入值有误，无效的结果");
			}
	  }
  }
}