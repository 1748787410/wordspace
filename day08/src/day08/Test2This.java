package day08;
//测试this关键字
//总结：
//1.如果想要完成构造方法的调用必须使用this关键字
//2.
public class Test2This {

	public static void main(String[] args) {
		new Penson();
	}
}
class Person{
	
	public Person() {
		this(10);
	}
	
	public Person(int a) {
		
	}
	
	public Person(String a,int e) {
		
	}
	public Person(int a, int b) {
		this(1);
	}
	public Person(String b,double a) {
		
	}
}