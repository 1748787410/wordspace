package day08;
//测试this关键字
//总结
//当成员变量和局部变量重名时，使用this调用成员变量
public class Test1This {

	public static void main(String[] args) {
		new Penson().show();
	}
}
class Penson {
	//当成员变量和局部变量同名时，使用this
	int sum = 10;
	int age = 20;//成员变量
	
	public void show() {
		int age = 10;//局部变量
		age = 100;
		this.age = 300;
		Penson p = new Penson();
		System.out.println(age);
		//使用同名的age成员变量
		//本质上，底层帮你创建了一个本类对象，叫做this
		//this代表本类对象的引用，可以调用本类的资源
		//Person this = new Person()
		System.out.println(this.age);
		
		System.out.println(sum);
	}
}
