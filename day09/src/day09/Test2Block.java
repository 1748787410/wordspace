package day09;
//测试 代码块
public class Test2Block {
//总结：
//触发节点：
//1.当类加载时，执行静态代码块
	
//3.当调用方法时，执行局部代码块

//执行顺序：
	public static void main(String[] args) {
		new Person2().show();
		new Person2().show();
		
	}
}
class Person2{
	//TODO 静态代码块-在成员位置-类加载时触发
	static {//来得早，走得晚. 在加载一次
		System.out.println(9);
	}
	
	//TODO 构造代码块-在成员位置--new时触发
	String eat;{
		System.out.println(1);
	}
	private void sout() {
		// TODO Auto-generated method stub
		
	}
	
	//TODO Constructor--new时触发
	public Person2() {
		System.out.println(3);
	}
	
	//TODO 局部代码块-在局部位置-调用方法时才会触发-控制
	public void show() {
		System.out.println(2);
		
	}
}