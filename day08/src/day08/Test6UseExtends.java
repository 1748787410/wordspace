package day08;
//测试  继承的  构造方法  使用
//总结：
//1.子类继承了父类后，构造方法里，默认隐藏着super()
//2.当父类不存在无参构造时(只提供了含参构造)，
//子类只能调用父类的含参构造
//3.父类的构造方法 可以被继承吗？？？--不可以
//4.继承里哪些资源不可以--私有的+构造方法
public class Test6UseExtends {

	public static void main(String[] args) {
		//先执行父类的构造方法--super()
		//在执行子类自己的
		new zi3();
	}
}
class fu3{
	public fu3() {
		System.out.println("父类的构造方法");
		}
		public fu3(int a) {
			System.out.println(545);
		}
	
}
class zi3 extends fu3{
	public zi3() {
		//隐藏的super语句，默认就存在，而且实在第一条语句，第二条会出现报错
		//super()主动找父类的  无参  构造方法
		super();//当父类不存在无参构造super必须带有参数
		System.out.println("子类的构造方法");
	}
}