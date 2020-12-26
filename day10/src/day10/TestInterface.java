package day10;
//测试 接口
public class TestInterface {

	public static void main(String[] args) {
//		A a = new A();//A接口不能new
//		A a = new B();//B抽象类不能new
		A a = new C();//多态
		a.eat();
		a.sleep();
		a.sport();
	}
}
//定义接口
interface A{
	public abstract void eat();
	public abstract void sleep();
	public abstract void sport();
}
//实现类使用接口，发生实现关系implements
abstract class B implements A{
//实现类 要么还是一个抽象类
	abstract public void Ben(); 
	abstract public void Ben2();
	abstract public void Ben3();
}
class C implements A{
	public void eat() {
		System.out.println("吃");
	}
	public void sleep() {
		System.out.println("睡觉");
	}
	public void sport() {
		System.out.println("跑步");
	}
}