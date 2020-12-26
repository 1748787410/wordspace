package day08;
//测试继承的  成员方法  使用
//总结：
//1.子类继承父类后，
//2.可以使用父类的所有功能（除了private）
//3.还可以进行功能拓展
//4.还可以修改父类的功能--重写--
//在不影响父类原有功能的前提下，把子类的功能进行修改
//5.重写的要求:继承关系+有权限+方法声明和父类一样
//6.开闭原则OCP：关闭源码修改，开发功能拓展
public class Test5UseExtends {

	public static void main(String[] args) {
		zi2 e = new zi2();
		e.show();//没重写，用父类的，发生重写，使用子类的
		e.jicheng();//使用自己的拓展
	}
}

class fu2{
	public void show() {
		int day = 12;
		String name = "Mike";
		int year = 17;
		System.out.println(day);
		System.out.println(year);
	}
}
//子类可以：：：继承父类的（除了private）..拓展自己的
class zi2 extends fu2{
	int age = 15;
	public void jicheng() {
		// 2.改 父类的功能--方法里的重写
		//要求：子类的方法声明必须和父类一样+有足够的权限
		System.out.println(100+2);
	}
		public void show(){
			int day = 12;
			System.out.println(day = 14);
			super.show();//调用父类的功能，原来的功能重写后不会收到影响
			System.out.println();
			}
		
		
	
	//2.改父类的功能-- 方法的重写
}