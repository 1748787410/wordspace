package day5.method;
//测试  方法返回值
public class Test6 {

	public static void main(String[] args) {
		//2.不处理sum返回来的结果
		sum(10,5);
		//3.res保存了sum返回来的结果
		int res = sum(10,5);
		System.out.println(res);//得到15
		
		String s = add(1,5);
		System.out.println(s);
		
		int x = print ("jack",1,2);
		System.out.println(x);
	}

	private static int print(String b,int c,int d) {
		  
		  	return d+c ;
	}
	
	private static String add(int a, int b) {
		return a+b+"" ;
	}

	//创建sum() --把执行的结果返回
	//修饰符 返回值 方法名([参数列表]){ }
	//1.如果方法需要返回值，返回值的位置- -写返回值的类型
	//void为无返回值，若有返回值需替换为返回的类型
	private static int sum(int i, int j) {
		System.out.println(i+j);//得出15
		System.out.println(""+i+j);//105
		  return i+j ;//1，使用return关键字，返回给调用的位置
		
	}
}
