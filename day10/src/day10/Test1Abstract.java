package day10;
//���� ��������ص�
public class Test1Abstract {

	public static void main(String[] args) {
		fu f = new Zi();
		
	}
}
//1.�������ǳ�����ƵĽ�������ṩ������
//3.����������󷽷�������һ��������
//4.����������������ͨ������Ҳ�����ǳ��󷽷�
abstract class fu{
	public void fu() {
		System.out.println("�Է�");
	}
	//TODO 2.û�з�����ķ����������󷽷�
	 
}
class Zi extends fu{}

class SON extends fu{
	public void fu() {
		System.out.println("������");
	}
	public void eat() {
		System.out.println(111);
		
	}
	public void zi2() {
			System.out.println(222);
		}
	public void zi3() {
		System.out.println(333);
	}
	
}