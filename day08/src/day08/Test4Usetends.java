package day08;
//���� �̳е�  ��Ա����  ��ʹ��
//�ܽ᣺
//1.������Ҫ�ø��׵³�Ա����������ͨ��superʹ��
//2.super �ڵײ���㴴����һ������Ķ���
//3.ͨ��superʹ�ø���Ĺ���
public class Test4Usetends {

	public static void main(String[] args) {
		new zi().show();
	}
}
class fu{
	String name = "rose";
}
class zi extends fu{
	int age = 10;
	String name = "jack";
	public void show() {
		int age = 20;
		System.out.println(age);//�ͽ�ԭ��ʹ�þֲ�����age
		
		System.out.println(this.age);//ʹ�ó�Ա����age
		
		System.out.println(name);//ʹ���˸���Ĺ���
		//super��ʾ��������һ�����ã�ר���������ø���Ĺ���
		//fu t = new fu();
		System.out.println(super.name);
	}
}