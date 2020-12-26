package day03;

public class Test3 {

	public static void main(String[] args) {
		//System.out.println(3f/2);
		
	    byte a = 3;
		byte b = 4;
		byte c = (byte) (a+b);
		
		byte i = 3;
		byte j = 4;
		byte k = (byte) (a+b);
		
		System.out.println(300000000*60*60*24*365);
		System.out.println(300000000L*60*60*24*365);
		
		System.out.println(1-0.8);
		System.out.println(3.55/0);
		
		
		int t = 25;
		System.out.println(a%10);
		System.out.println(a/10);
		
		int s = 123;
		System.out.println(s%10);
		System.out.println((s/10)%10);//(s % 100 / 10)
		System.out.println(s/100);
		
		int x = 1;
		System.out.println(x++);//1
		
		int y = 1;
		System.out.println(++y);
		
		//System.out.println(++x+y+y++);
		System.out.println(++x+y+y+++x);//3+2+3+2
		
		System.out.println('0'+1);
		int se = 'Œ“';
		System.out.println(se);
	}
}
