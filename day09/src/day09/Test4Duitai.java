package day09;
//���� ��̬
public class Test4Duitai {

	public static void main(String[] args) {
		//����������� ����:
		//�������ø���̳����ģ��������Լ���չ��
		Dog d = new Dog();
		d.eat();//�����
		d.sport();//�����
		d.show();//�Լ���չ��
		//TODO ������̬����
		//�ھ�1�����������������
		Animal a = new Dog();//��̬ / ��������
		//�ھ�2�����뿴��ߣ����п��ұ�
//		�ô��ǣ�ͳһ��׼������Ǳ�׼
//		a.show();�������з�����������
		
		
	}
}


//ǰ�᣺�̳�+��������д
//����д���Ե�����
class Animal{
	public void eat() {
	System.out.println("����");
	
	}
	public void sport() {
		System.out.println("walk");
	}
}
class Dog extends Animal{
		@Override//ע��
		public void sport() {
		System.out.println("ball");
		
	}
		public void show() {
			System.out.println("show");
		}
}