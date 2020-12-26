package cn.tedu.basic;
//测试取值范围
public class Test1 {

	public static void main(String[] args) {
		
		byte a = -128;
		byte b = 127;
		
		short c = Short.MIN_VALUE;//调用记录Short的最小值的工具来声明Short的最小值并赋值
		short d = Short.MAX_VALUE;
		
		int e = Integer.MIN_VALUE;
		int f = Integer.MAX_VALUE;
		
		long g = Long.MIN_VALUE;
		long h = Long.MAX_VALUE;
		
		float i = Float.MIN_VALUE;
		float j = Float.MAX_VALUE;
		
		double k = Double.MIN_VALUE;
		double o = Double.MAX_VALUE;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(o);
	}

}
