package day04;

public class Test3 {

	public static void main(String[] args ) {
		 
		for(int i = 0; i<=10; i++) {
			System.out.print(i+",");
			}
			System.out.println();
		for(int j = 10; j>=0; j--) {
			System.out.print(j+",");
		}
		
		System.out.println();
		
		
		for(int i = 8; i <= 100000000; i=i*10+8)
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i%2==0){
				sum=sum+i;
				System.out.print(i+" ");
			}
			
		}
		System.out.println();
		 int count = 0;
		
		 for(int i = 1; i <= 100; i++) 
		 {
			
			 if(i%2==1) 
			 {
				System.out.print(i+" ");
			 }
			 if(i%2==1) 
			 {
				 count++;
			 }
		}
					 System.out.println();
			System.out.println(count);
			System.out.println(sum);
 	}
}
