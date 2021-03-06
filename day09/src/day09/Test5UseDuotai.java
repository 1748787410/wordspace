package day09;

//测试  多态的使用
public class Test5UseDuotai {
//总结：
//1.多态用来统一调用标准，标准是父类
//2.创建对象的口诀：父类引用指向子类对象
//3.编译看左边，运行看右边

	public static void main(String[] args) {
		// TODO 创建多态对象测试
		// 成员变量是--父类的
		// 成员方法是
		fu1 f = new zi1();
		
		System.out.println(f.name);
		// 方法声明父类的，方法体-子类的（重写了）
		f.sleep();
		// 静态方法可以被重写吗
		f.game();
		
		zi1 son = new zi1();
		son.sleep();
	}
}

class fu1 {
	String name = "老蔡";

	public void sleep() {
		
		System.out.println("睡觉");
	}

	public void sport() {
		System.out.println("打球");
	}

	static public void game() {
		System.out.println("打游戏");
	}
}
	class zi1 extends fu1 {
		String name = "小蔡";

		@Override
		public void sleep() {
			System.out.println("起床");
		}
		static public void game() {
			System.out.println("打不过");
		}
	}
