package day07;

//测试  构造代码块
public class Test5Block {

	public static void main(String[] args) {
//		2.先执行构造代码块然后执行构造方法
		new Demo(5);
		new Demo("5");
		new Demo('5');
		new Demo(2, 3);
		new Demo(0).show();
		//匿名对象，用得少，
		//因为一次只执行一个任务
	}
}

class Demo {
	// 1.构造代码块：在成员位置+触发节点是new时
	// 用来提取构造方法的共性
	int age;
	{
		age = 5;// 提高复用性，可重复使用
	}

	// TODO Constructor
	public Demo(int a) {
		System.out.println("2+3=" + age);
	}

	public Demo(String a) {
		System.out.println("1+4=" + age);
	}

	public Demo(char[] b) {
		System.out.println("10-5=" + age);
	}

	public Demo(int b, int a) {

	}

	public void show() {
		//2.局部代码块：在方法里+触发节点是调用方法时+用来控制变量的范围
		{
			int a = 10;
			System.out.println(a);
			System.out.println("局部代码块");
		}
	}
}