package day07;
//ʹ�������� ��Ϊģ��
public class Test2Car {

	public static void main(String[] args){
		//1ʹ��ģ��Car
		//ͨ��new�ؼ��� ������������
		new Car();//��������
		//C ���������͵ı�����Ĭ��ֵ��null��������״�����һ����ֵַ
		Car c1 = null;
		//��C���󱣴���null������null�����Ժͷ���ʱ�����׳���ָ���쳣
		//java.lang.NullPointerException��ָ���쳣
		//cn.tedu.basic.Car@15db9742
		Car c = new Car();
		//C����.ģ����Ĺ��ܣ���
		c.run();
		
		
		c.back();
		//C����ģ����ı���
		c.pinpai = "����";//���ñ�����ֵ
		//��ȡֵnull->
		c.price = 2.0;
		c.color = "black";
		
		System.out.println(c.pinpai);
		System.out.println(c.price);
		System.out.println(c.color);
		
		Car c2 = new Car();
		
		c2.pinpai = "BM";
		c2.color = "red";
		c2.price = 8.0;
		System.out.println(c2.pinpai);
		System.out.println(c2.color);
		System.out.println(c2.price);
		} 
}
