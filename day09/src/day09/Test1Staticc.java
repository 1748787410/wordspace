package day09;

public class Test1Staticc {

	public static void main(String[] args) {
		Person e = new Person();
		e.cdoe();
		e.eat();
		System.out.println(e.cdoe);
		System.out.println(e.eat);
		
		Person p2 = new Person();
		p2.name = "jerry";
		System.out.println(p2);
	}
	
}
class Person{
	public char[] eat;
	public static char[] cdoe;
	//普通资源
	int i = 0;
	public void eat() {
		//普通资源调用静态资源--可以
		System.out.println("吃");
		System.out.println(name);
	}
	//静态资源--随着类的加载而加载
	static String name ="jack";
	static void cdoe(){
		//静态资源调用普通资源--不可以
		//静态资源只能调用静态资源
		
		System.out.println();
		System.out.println("code");
	}
	
}

