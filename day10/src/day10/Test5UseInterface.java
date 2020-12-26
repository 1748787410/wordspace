package day10;

public class Test5UseInterface {

	public static void main(String[] args) {
		Inter c = new InterImpl(); 
//		c.age;
	}
}
//接口里的资源都是public的，不能private；
interface Inter{
	//1.接口里有构造方法吗--没有
//	public Inter() {}
	
	//2.接口里有变量吗--没有
	int age = 10; //常量的简写
	//接口的常量，会自动拼接public static final
	
	//3.接口里的抽象方法
	void S1();//简写的抽象方法
	//接口会为简写的抽象方法自动拼接public abstract
	//abstract public void S1();
}
class InterImpl implements Inter{
	public void S1() {
		
	}
}