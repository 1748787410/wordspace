package day09;

public class Test1Staticc {

	public static void main(String[] args) {
		Person e = new Person();
		e.cdoe();
		e.eat();
		System.out.println(e.cdoe);
		System.out.println(e.eat);
		
		Person p2 = new Person();
		p2.name = "jerry";
		System.out.println(p2);
	}
	
}
class Person{
	public char[] eat;
	public static char[] cdoe;
	//��ͨ��Դ
	int i = 0;
	public void eat() {
		//��ͨ��Դ���þ�̬��Դ--����
		System.out.println("��");
		System.out.println(name);
	}
	//��̬��Դ--������ļ��ض�����
	static String name ="jack";
	static void cdoe(){
		//��̬��Դ������ͨ��Դ--������
		//��̬��Դֻ�ܵ��þ�̬��Դ
		
		System.out.println();
		System.out.println("code");
	}
	
}
