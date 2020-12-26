package day07;
//使用汽车类 作为模板
public class Test2Car {

	public static void main(String[] args){
		//1使用模板Car
		//通过new关键字 创建汽车对象
		new Car();//匿名对象
		//C 是引用类型的变量，默认值是null，但是现状存的是一个地址值
		Car c1 = null;
		//当C对象保存了null，调用null的属性和方法时都会抛出空指针异常
		//java.lang.NullPointerException空指针异常
		//cn.tedu.basic.Car@15db9742
		Car c = new Car();
		//C调用.模板里的功能？？
		c.run();
		
		
		c.back();
		//C调用模板里的变量
		c.pinpai = "红旗";//设置变量的值
		//获取值null->
		c.price = 2.0;
		c.color = "black";
		
		System.out.println(c.pinpai);
		System.out.println(c.price);
		System.out.println(c.color);
		
		Car c2 = new Car();
		
		c2.pinpai = "BM";
		c2.color = "red";
		c2.price = 8.0;
		System.out.println(c2.pinpai);
		System.out.println(c2.color);
		System.out.println(c2.price);
		} 
}

