package day08;
//����this�ؼ���
//�ܽ�
//����Ա�����;ֲ���������ʱ��ʹ��this���ó�Ա����
public class Test1This {

	public static void main(String[] args) {
		new Penson().show();
	}
}
class Penson {
	//����Ա�����;ֲ�����ͬ��ʱ��ʹ��this
	int sum = 10;
	int age = 20;//��Ա����
	
	public void show() {
		int age = 10;//�ֲ�����
		age = 100;
		this.age = 300;
		Penson p = new Penson();
		System.out.println(age);
		//ʹ��ͬ����age��Ա����
		//�����ϣ��ײ���㴴����һ��������󣬽���this
		//this�������������ã����Ե��ñ������Դ
		//Person this = new Person()
		System.out.println(this.age);
		
		System.out.println(sum);
	}
}
