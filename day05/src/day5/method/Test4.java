package day5.method;
//测试 方法调用
public class Test4 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		fun();//调用指定方法
		System.out.println(4);
		
	}
//创建指定方法fun() --执行的时间节点：是被调用时，不调用则不执行 
//语法：修饰符   		    返回值  方法名([参数列表]){ }
 	   private static void fun() {
		// TODO Auto-generated method stub
 		  System.out.println(7);
 		  System.out.println(8);
 		  System.out.println(9);
	   }
}
