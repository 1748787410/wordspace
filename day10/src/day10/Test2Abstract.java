package day10;
//测试 使用抽象类
//总结：
//1.抽象类里有构造方法，不是为自己new，为了子类new
//2.抽象类里有变量，有常量
//3.常量的值一旦定义就不能改了
//4.继承时，除了private和构造方法，都可以被继承的
public class Test2Abstract {

	public static void main(String[] args) {
		
		Fu2 f = new zi2();
		f.name = "小芳";
		System.out.println(f.name);
//		Fu2.MAX_VALUE = 110;常量的值不能改
	}
}
abstract class Fu2{
	//抽象类里可以有--构造函数
	//构造方法一般用来new，抽象类不能new
	//
	public Fu2() {
		System.out.println(1);
	}
//2.抽象类里可以有--成员变量
	String name = "XX";
//3.抽象类里可以有--常量
	public static final int MAX_VALUE = 127;
} 
class zi2 extends Fu2{
	public zi2() {
		super();
		System.out.println(2);
	}
}