package day08;
//����this�ؼ���
//�ܽ᣺
//1.�����Ҫ��ɹ��췽���ĵ��ñ���ʹ��this�ؼ���
//2.
public class Test2This {

	public static void main(String[] args) {
		new Penson();
	}
}
class Person{
	
	public Person() {
		this(10);
	}
	
	public Person(int a) {
		
	}
	
	public Person(String a,int e) {
		
	}
	public Person(int a, int b) {
		this(1);
	}
	public Person(String b,double a) {
		
	}
}