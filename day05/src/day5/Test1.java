package day5;

import java.util.Random;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		/*for(int i = 1; i <= 100; i++) {
			if(i%2==0)
			{   
				System.out.println(i);
				continue;
			}
		}*/
		
	for(int i = 1; i <= 100; i++){
			int num = new Scanner(System.in).nextInt();
			int ra =  new Random().nextInt();
			if(num == ra) 
			{
				System.out.println("猜对了");
				break;
			}
			else 
			{
				System.out.println("不对，继续输入：");
				continue;
			}
		}
	}

	private static int random(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int random() {
		// TODO Auto-generated method stub
		return 0;
	}
}
