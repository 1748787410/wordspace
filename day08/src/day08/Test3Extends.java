package day08;
//����  �̳�
public class Test3Extends {

	public static void main(String[] args) {
		new son().sleep();//ʹ���˰ְ�����Ĺ���
		new son().eat();//ʹ����үү����Ĺ���
	}
}
//���常��
//4.�����ȡ����Ĺ��Դ���
class father extends yeye{
	void sleep() {
		// TODO Auto-generated constructor stub
		
		System.out.println("˯��");
	}
}
class yeye{
	public void eat() {
		System.out.println("�Է�");
	}
}
//��������
//ʹ�ùؼ���extends��ʾ�̳й�ϵ

class son extends father{
//2.�������ʹ�ø�������й���
//3.�̳й�ϵ��һ��ǿ�Ƶ�������ϵ����ǿ���
}