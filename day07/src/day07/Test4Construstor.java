package day07;
//���� ���췽��������
//�ܽ�:
//1.���췽�������ã�������������
//2.�����ڵ�:new/ʵ����ʱ
//3.Ĭ�ϴ���һ���޲ι���
//4.����Ա������ֵ
public class Test4Construstor {

	public static void main(String[] args) {
		Person e = new Person();
		//����person����
		new Person(5);
		new Person("",1);
		new Person(3.0);
	}
}
class Person{
	//����  ���췽��
	//TODO �ṩ���췽��
	//���η� ������[�����б�]��{������}
	//TODO ���췽����ִ��ʱ��ڵ���--��������ʱ
	int age;
	public Person(int a) {
	//TODO 3.���췽��Ҳ��������-- ������һ�������б�ͬ
//		System.out.println("�޲ι��췽��");
		age = a;
		System.out.println(age);
	}
	public Person(String a,int b) {
		//1.TODO �޲ι���Ĭ�Ͼʹ��ڣ������ص�
		//2.ֻ�ṩ���ι���ʱ�����޲ι����û���ˣ�����
	}
	public Person(double a) {
		
	}
	public Person() {
		
	}
	
}
