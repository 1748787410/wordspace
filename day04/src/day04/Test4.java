package day04;

public class Test4 {

	public static void main(String[] args) {
		for(int i = 1; i <= 3; i++) 
		{
			 System.out.println(i);
			for(int j = 1; j <= 5; j++) 
			{
				System.out.println(j);
			}
			
		}
		
		System.out.println();
		
		for(int i = 1; i < 4; i++) 
		{
			for(int j = 1; j < 3; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 1; i <= 5; i++) {//外循环控制行
			for(int j = 1; j <= 5; j++) {//内循环控制列
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}      

}
