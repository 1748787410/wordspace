package day10;
//���� ʹ�ó�����
//�ܽ᣺
//1.���������й��췽��������Ϊ�Լ�new��Ϊ������new
//2.���������б������г���
//3.������ֵһ������Ͳ��ܸ���
//4.�̳�ʱ������private�͹��췽���������Ա��̳е�
public class Test2Abstract {

	public static void main(String[] args) {
		
		Fu2 f = new zi2();
		f.name = "С��";
		System.out.println(f.name);
//		Fu2.MAX_VALUE = 110;������ֵ���ܸ�
	}
}
abstract class Fu2{
	//�������������--���캯��
	//���췽��һ������new�������಻��new
	//
	public Fu2() {
		System.out.println(1);
	}
//2.�������������--��Ա����
	String name = "XX";
//3.�������������--����
	public static final int MAX_VALUE = 127;
} 
class zi2 extends Fu2{
	public zi2() {
		super();
		System.out.println(2);
	}
}