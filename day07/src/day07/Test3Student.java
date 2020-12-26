package day07;

import day07.student;


public class Test3Student {

	public static void main(String[] args) {
		
		student b = new student();
		
		
		b.setName("jack"); 
		b.setYears(18);
		b.setGender('男');
		b.setId(90);
		
		System.out.println(b.getName());
		System.out.println(b.getYears());
		System.out.println(b.getGender());
		System.out.println(b.getId());
		
//		b.study;//被private封装了，没法直接调用
		b.sleep();
		
	}
}
