package day5;
//测试变量
public class Test3 {//类开始
//1.成员变量：类里方法外+不需要初始化+整个类中都有效
static char age ;
int i = 20;
//测试其他数据的默认值
//int   double   boolean    char    String
// 0      0.0      false               0
	public static void main(String[] args) {//方法开始
//2.局部变量：方法里	+必须初始化+只在方法里有效	
		int i = 8;
		System.out.println(age);
		System.out.println(i);//就近原则
//3.当成员变量名 和 局部变量名 相同时，就近原则，优先使用离自己近的一个变量		
	}
}
