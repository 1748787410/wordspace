package day07;
//测试 构造方法的作用
//总结:
//1.构造方法的作用：用来创建对象
//2.触发节点:new/实例化时
//3.默认存在一个无参构造
//4.给成员变量赋值
public class Test4Construstor {

	public static void main(String[] args) {
		Person e = new Person();
		//创建person对象
		new Person(5);
		new Person("",1);
		new Person(3.0);
	}
}
class Person{
	//隐藏  构造方法
	//TODO 提供构造方法
	//修饰符 类名（[参数列表]）{方法体}
	//TODO 构造方法的执行时间节点是--创建对象时
	int age;
	public Person(int a) {
	//TODO 3.构造方法也可以重载-- 方法名一样参数列表不同
//		System.out.println("无参构造方法");
		age = a;
		System.out.println(age);
	}
	public Person(String a,int b) {
		//1.TODO 无参构造默认就存在，是隐藏的
		//2.只提供含参构造时，，无参构造就没有了！！！
	}
	public Person(double a) {
		
	}
	public Person() {
		
	}
	
}
