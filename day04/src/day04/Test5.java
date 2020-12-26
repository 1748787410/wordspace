package day04;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		int p = new Scanner(System.in).nextInt();
		for( int i = 1;i <= p; i++) {
			/*i=1 满足条件，执行第三大步，j=1，；j<=1,所以j只能执行一次，打印*，换行
			 *i=2 满足条件，执行第三大步，j=1，；j<=2,所以j只能执行两次，打印**，换行
			 *i=3 满足条件，执行第三大步，j=1，；j<=3,所以j只能执行三次，打印***，换行
			 *i=4 满足条件，执行第三大步，j=1，；j<=4,所以j只能执行四次，打印****，换行
			 *i=5 满足条件，执行第三大步，j=1，；j<=5,所以j只能执行五次，打印*****，换行
			 *j<=i，j的列数随着i的行数增加
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

