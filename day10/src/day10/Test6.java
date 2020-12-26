package day10;
//测试 接口的复杂用法
public class Test6 {

	public static void main(String[] args) {
		S1 s = new Implement();
		S2 e = new Implement();
		s.save();
		e.get();
		
	}
}
interface S1 {
	void save();
}
interface S2{
	void get();
}//接口间--是继承关系，而且可以多继承(逗号隔开就可以了)
interface S3 extends S1,S2{
	void delete();//同时拥有1 2 3接口的功能
}
//实现类和接口 -- 是实现关系，还能多实现
 class Implement implements S1,S2{
	//需要重写1接口中的抽象方法，否则就是一个抽象类
	//接口里的方法，是public的，重写是要注意权限
	 public void save() {
		 System.out.println("save");
	 }
	 public void get() {
		 System.out.println("get");
	 }
}
 