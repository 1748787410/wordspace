package day08;
//����  �̳е�  ���췽��  ʹ��
//�ܽ᣺
//1.����̳��˸���󣬹��췽���Ĭ��������super()
//2.�����಻�����޲ι���ʱ(ֻ�ṩ�˺��ι���)��
//����ֻ�ܵ��ø���ĺ��ι���
//3.����Ĺ��췽�� ���Ա��̳��𣿣���--������
//4.�̳�����Щ��Դ������--˽�е�+���췽��
public class Test6UseExtends {

	public static void main(String[] args) {
		//��ִ�и���Ĺ��췽��--super()
		//��ִ�������Լ���
		new zi3();
	}
}
class fu3{
	public fu3() {
		System.out.println("����Ĺ��췽��");
		}
		public fu3(int a) {
			System.out.println(545);
		}
	
}
class zi3 extends fu3{
	public zi3() {
		//���ص�super��䣬Ĭ�Ͼʹ��ڣ�����ʵ�ڵ�һ����䣬�ڶ�������ֱ���
		//super()�����Ҹ����  �޲�  ���췽��
		super();//�����಻�����޲ι���super������в���
		System.out.println("����Ĺ��췽��");
	}
}