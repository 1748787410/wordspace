package day10;
//���� �ӿ�
public class TestInterface {

	public static void main(String[] args) {
//		A a = new A();//A�ӿڲ���new
//		A a = new B();//B�����಻��new
		A a = new C();//��̬
		a.eat();
		a.sleep();
		a.sport();
	}
}
//����ӿ�
interface A{
	public abstract void eat();
	public abstract void sleep();
	public abstract void sport();
}
//ʵ����ʹ�ýӿڣ�����ʵ�ֹ�ϵimplements
abstract class B implements A{
//ʵ���� Ҫô����һ��������
	abstract public void Ben(); 
	abstract public void Ben2();
	abstract public void Ben3();
}
class C implements A{
	public void eat() {
		System.out.println("��");
	}
	public void sleep() {
		System.out.println("˯��");
	}
	public void sport() {
		System.out.println("�ܲ�");
	}
}