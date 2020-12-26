package day09;
//测试 多态
public class Test4Duitai {

	public static void main(String[] args) {
		//创建子类对象 测试:
		//子类能用父类继承来的，还可以自己扩展的
		Dog d = new Dog();
		d.eat();//父类的
		d.sport();//子类的
		d.show();//自己拓展的
		//TODO 创建多态对象
		//口诀1：父类引用子类对象
		Animal a = new Dog();//多态 / 向上造型
		//口诀2：编译看左边，运行看右边
//		好处是：统一标准，类就是标准
//		a.show();子类特有方法，不能用
		
		
	}
}


//前提：继承+方法的重写
//父类写共性的内容
class Animal{
	public void eat() {
	System.out.println("吃肉");
	
	}
	public void sport() {
		System.out.println("walk");
	}
}
class Dog extends Animal{
		@Override//注解
		public void sport() {
		System.out.println("ball");
		
	}
		public void show() {
			System.out.println("show");
		}
}