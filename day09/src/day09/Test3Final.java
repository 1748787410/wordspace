package day09;
//测试  final  关键字
public class Test3Final {
//可以修饰类，被修饰的类不能被继承
//可以修饰方法，修饰的方法不能被修改
//可以修饰常量，值不能被修改，变成了常量
	public static void main(String[] args) {
		//TODO 创建对象  测试
		zi z = new zi();
		//z.age = 30;
		System.out.println(z.age);
	}
}
class fu{
	final int age = 10;
	 public void eat() {
		 int i = 1;
		
	}
}
class zi extends fu{
	
	 public void eat() {
		 
	}
}