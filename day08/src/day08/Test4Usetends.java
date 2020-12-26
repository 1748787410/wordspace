package day08;
//测试 继承的  成员变量  的使用
//总结：
//1.子类想要用弗雷德成员变量，，，通过super使用
//2.super 在底层帮你创建了一个父类的对象
//3.通过super使用父类的功能
public class Test4Usetends {

	public static void main(String[] args) {
		new zi().show();
	}
}
class fu{
	String name = "rose";
}
class zi extends fu{
	int age = 10;
	String name = "jack";
	public void show() {
		int age = 20;
		System.out.println(age);//就近原则，使用局部变量age
		
		System.out.println(this.age);//使用成员变量age
		
		System.out.println(name);//使用了父类的功能
		//super表示父类对象的一个引用，专门用来调用父类的功能
		//fu t = new fu();
		System.out.println(super.name);
	}
}