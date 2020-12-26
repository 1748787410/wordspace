package day5.method;
//测试 方法传参
public class Test5 {

	public static void main(String[] args) {
		add(15,24);//调用指定的方法
		add2("tr");
		add3(8,4,"ate");
		add4("eks","jsl",5);
	}
	
	
	private static void add4(String e, String t, int a) {
		// +的作用：两个加号都是拼接   字符串+整数    string+int=（string  ing）
		System.out.println(e+ t+ a);
	}


	private static void add3(int i, int j, String ad) {
		// 第一个加号的作用是整数相加，第二个加号是拼接后面的字符串
		System.out.println(i +  j +  ad);
	}


	private static void add2(String t) {
		// TODO Auto-generated method stub
		System.out.println(t);
	}


	private static void add(int a ,int b) {
		// TODO Auto-generated method stub
		System.out.println(a);
		System.out.println(b);
	}
	//创建add ()
	//修饰符  返回值  方法名 (参数类型 参数名){ }
	//参数类型  必须  与调用方法的小括号中的类型匹配
}
