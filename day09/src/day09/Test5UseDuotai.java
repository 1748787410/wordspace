package day09;

//����  ��̬��ʹ��
public class Test5UseDuotai {
//�ܽ᣺
//1.��̬����ͳһ���ñ�׼����׼�Ǹ���
//2.��������Ŀھ�����������ָ���������
//3.���뿴��ߣ����п��ұ�

	public static void main(String[] args) {
		// TODO ������̬�������
		// ��Ա������--�����
		// ��Ա������
		fu1 f = new zi1();
		
		System.out.println(f.name);
		// ������������ģ�������-����ģ���д�ˣ�
		f.sleep();
		// ��̬�������Ա���д��
		f.game();
		
		zi1 son = new zi1();
		son.sleep();
	}
}

class fu1 {
	String name = "�ϲ�";

	public void sleep() {
		
		System.out.println("˯��");
	}

	public void sport() {
		System.out.println("����");
	}

	static public void game() {
		System.out.println("����Ϸ");
	}
}
	class zi1 extends fu1 {
		String name = "С��";

		@Override
		public void sleep() {
			System.out.println("��");
		}
		static public void game() {
			System.out.println("�򲻹�");
		}
	}