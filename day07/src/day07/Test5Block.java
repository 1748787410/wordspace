package day07;

//����  ��������
public class Test5Block {

	public static void main(String[] args) {
//		2.��ִ�й�������Ȼ��ִ�й��췽��
		new Demo(5);
		new Demo("5");
		new Demo('5');
		new Demo(2, 3);
		new Demo(0).show();
		//���������õ��٣�
		//��Ϊһ��ִֻ��һ������
	}
}

class Demo {
	// 1.�������飺�ڳ�Աλ��+�����ڵ���newʱ
	// ������ȡ���췽���Ĺ���
	int age;
	{
		age = 5;// ��߸����ԣ����ظ�ʹ��
	}

	// TODO Constructor
	public Demo(int a) {
		System.out.println("2+3=" + age);
	}

	public Demo(String a) {
		System.out.println("1+4=" + age);
	}

	public Demo(char[] b) {
		System.out.println("10-5=" + age);
	}

	public Demo(int b, int a) {

	}

	public void show() {
		//2.�ֲ�����飺�ڷ�����+�����ڵ��ǵ��÷���ʱ+�������Ʊ����ķ�Χ
		{
			int a = 10;
			System.out.println(a);
			System.out.println("�ֲ������");
		}
	}
}