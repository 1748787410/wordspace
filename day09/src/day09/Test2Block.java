package day09;
//���� �����
public class Test2Block {
//�ܽ᣺
//�����ڵ㣺
//1.�������ʱ��ִ�о�̬�����
	
//3.�����÷���ʱ��ִ�оֲ������

//ִ��˳��
	public static void main(String[] args) {
		new Person2().show();
		new Person2().show();
		
	}
}
class Person2{
	//TODO ��̬�����-�ڳ�Աλ��-�����ʱ����
	static {//�����磬�ߵ���. �ڼ���һ��
		System.out.println(9);
	}
	
	//TODO ��������-�ڳ�Աλ��--newʱ����
	String eat;{
		System.out.println(1);
	}
	private void sout() {
		// TODO Auto-generated method stub
		
	}
	
	//TODO Constructor--newʱ����
	public Person2() {
		System.out.println(3);
	}
	
	//TODO �ֲ������-�ھֲ�λ��-���÷���ʱ�Żᴥ��-����
	public void show() {
		System.out.println(2);
		
	}
}