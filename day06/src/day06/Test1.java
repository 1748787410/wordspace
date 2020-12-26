package day06;
//测试  数组的创建
public class Test1 {

	public static void main(String[] args) {
		char[] a = new char [5];//不修改的char类型默认为/u0000或者空格
		
		 a[0] = 'h';
		 a[1] = 'e';
		 a[2] = 'l';
		 a[3] = 'l';
		 a[4] = 'o';
		 
		 char[] b = new char []{'h','e','l','l','o'};
	
		 //访问了不存在的下标，就会报错：数组下标越界
		 //java.lang.ArrayIndexOutOfBoundsException:5
		 	//System.out.println(a[5]);
		 System.out.println(a);
			 		
		 	   }
	}		

