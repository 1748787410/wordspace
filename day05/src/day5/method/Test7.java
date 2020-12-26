package day5.method;
//测试  方法重载
public class Test7 {

	public static void main(String[] args) {
		print("中");
		print(123);
		print(9.6);
		print("Java开发程序猿");
		print(true);
	}
	//提供重载的print
	    
	
	private static void print(char a) {
		System.out.println(a);
	}
	
	private static void print(int a) {
		System.out.println(a);
	}
	
	private static void print(double a) {
		System.out.println(a);
	}
	
	private static void print(String a) {
		System.out.println(a);
	}
	private static void print(boolean a ) {
		System.out.println(a);
	}
}
