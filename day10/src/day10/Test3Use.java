package day10;

//���� ʹ�ó�����
public class Test3Use {
//�ܽ᣺
//1.�����������Ϊ��������ͨ����Ҳ�����г��󷽷�
//2.����̳г������
//Ҫô�ͻ���һ�������ࣨ�������󷽷���
//Ҫô����д���г��󷽷�
//3.������ô��������Ҫ��д�ĸ�����
//������ͨ��������ľ���д
//���ڳ��󷽷�������д�Ļ�������һ�����������
	public static void main(String[] args) {
		// TODO
	}
}

abstract class fu3 {

}

//�������ﶼ�ǳ��󷽷�
abstract class zi3 extends fu3 {
	public abstract void son1();

	abstract void son2();

	abstract void son3();

}

//�������ﶼ����ͨ����
//���������г��󷽷�����ͨ����
class zi4 extends fu3 {
	void son1() {
		System.out.println(1);
//Ҫô��һ�������࣬Ҫô��д���г��󷽷�
	}
}

abstract class fu4 {
	public void delete() {
	};

	void copy() {
	};

	class zi5 extends fu4 {
		public void delete() {
			System.out.println("ɾ��");
		}

		public void copy() {
			System.out.println("����");
		}
	}
}

abstract class fu5{
	 public abstract void test1();
			public void test2() {System.out.println("��ȷ");};
			public void test3() {System.out.println("����");};
}
class zi6 extends fu5{
	public void test1() {
		System.out.println(123);
	}
	//��д���еĳ��󷽷���������һ�����������
	public void test2() {System.out.println("��ȷ");};
	public void test3() {System.out.println("����");};
}