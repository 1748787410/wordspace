package day10;

public class Test5UseInterface {

	public static void main(String[] args) {
		Inter c = new InterImpl(); 
//		c.age;
	}
}
//�ӿ������Դ����public�ģ�����private��
interface Inter{
	//1.�ӿ����й��췽����--û��
//	public Inter() {}
	
	//2.�ӿ����б�����--û��
	int age = 10; //�����ļ�д
	//�ӿڵĳ��������Զ�ƴ��public static final
	
	//3.�ӿ���ĳ��󷽷�
	void S1();//��д�ĳ��󷽷�
	//�ӿڻ�Ϊ��д�ĳ��󷽷��Զ�ƴ��public abstract
	//abstract public void S1();
}
class InterImpl implements Inter{
	public void S1() {
		
	}
}