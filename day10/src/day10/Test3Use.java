package day10;

//测试 使用抽象类
public class Test3Use {
//总结：
//1.抽象类很灵活，因为可以有普通方法也可以有抽象方法
//2.子类继承抽象类后，
//要么就还是一个抽象类（包含抽象方法）
//要么是重写所有抽象方法
//3.子类怎么决定到底要重写哪个方法
//对于普通方法，想改就重写
//对于抽象方法，不重写的话，就是一个抽象的子类
	public static void main(String[] args) {
		// TODO
	}
}

abstract class fu3 {

}

//抽象类里都是抽象方法
abstract class zi3 extends fu3 {
	public abstract void son1();

	abstract void son2();

	abstract void son3();

}

//抽象类里都是普通方法
//抽象类里有抽象方法和普通方法
class zi4 extends fu3 {
	void son1() {
		System.out.println(1);
//要么是一个抽象类，要么重写所有抽象方法
	}
}

abstract class fu4 {
	public void delete() {
	};

	void copy() {
	};

	class zi5 extends fu4 {
		public void delete() {
			System.out.println("删除");
		}

		public void copy() {
			System.out.println("复制");
		}
	}
}

abstract class fu5{
	 public abstract void test1();
			public void test2() {System.out.println("正确");};
			public void test3() {System.out.println("错误");};
}
class zi6 extends fu5{
	public void test1() {
		System.out.println(123);
	}
	//重写所有的抽象方法，否则是一个抽象的子类
	public void test2() {System.out.println("正确");};
	public void test3() {System.out.println("错误");};
}