package day08;
//测试  继承
public class Test3Extends {

	public static void main(String[] args) {
		new son().sleep();//使用了爸爸类里的功能
		new son().eat();//使用了爷爷类里的功能
	}
}
//定义父类
//4.父类抽取子类的共性代码
class father extends yeye{
	void sleep() {
		// TODO Auto-generated constructor stub
		
		System.out.println("睡觉");
	}
}
class yeye{
	public void eat() {
		System.out.println("吃饭");
	}
}
//定义子类
//使用关键字extends表示继承关系

class son extends father{
//2.子类可以使用父类的所有功能
//3.继承关系是一种强制的以来关系——强耦合
}