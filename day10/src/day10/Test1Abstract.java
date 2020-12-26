package day10;
//测试 抽象类的特点
public class Test1Abstract {

	public static void main(String[] args) {
		fu f = new Zi();
		
	}
}
//1.抽象类是程序设计的结果，不提供方法体
//3.类里包含抽象方法，就是一个抽象类
//4.抽象类灵活，可以有普通方法，也可以是抽象方法
abstract class fu{
	public void fu() {
		System.out.println("吃饭");
	}
	//TODO 2.没有方法体的方法叫做抽象方法
	 
}
class Zi extends fu{}

class SON extends fu{
	public void fu() {
		System.out.println("吃完了");
	}
	public void eat() {
		System.out.println(111);
		
	}
	public void zi2() {
			System.out.println(222);
		}
	public void zi3() {
		System.out.println(333);
	}
	
}