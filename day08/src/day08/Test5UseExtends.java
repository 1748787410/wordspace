package day08;
//���Լ̳е�  ��Ա����  ʹ��
//�ܽ᣺
//1.����̳и����
//2.����ʹ�ø�������й��ܣ�����private��
//3.�����Խ��й�����չ
//4.�������޸ĸ���Ĺ���--��д--
//�ڲ�Ӱ�츸��ԭ�й��ܵ�ǰ���£�������Ĺ��ܽ����޸�
//5.��д��Ҫ��:�̳й�ϵ+��Ȩ��+���������͸���һ��
//6.����ԭ��OCP���ر�Դ���޸ģ�����������չ
public class Test5UseExtends {

	public static void main(String[] args) {
		zi2 e = new zi2();
		e.show();//û��д���ø���ģ�������д��ʹ�������
		e.jicheng();//ʹ���Լ�����չ
	}
}

class fu2{
	public void show() {
		int day = 12;
		String name = "Mike";
		int year = 17;
		System.out.println(day);
		System.out.println(year);
	}
}
//������ԣ������̳и���ģ�����private��..��չ�Լ���
class zi2 extends fu2{
	int age = 15;
	public void jicheng() {
		// 2.�� ����Ĺ���--���������д
		//Ҫ������ķ�����������͸���һ��+���㹻��Ȩ��
		System.out.println(100+2);
	}
		public void show(){
			int day = 12;
			System.out.println(day = 14);
			super.show();//���ø���Ĺ��ܣ�ԭ���Ĺ�����д�󲻻��յ�Ӱ��
			System.out.println();
			}
		
		
	
	//2.�ĸ���Ĺ���-- ��������д
}