package day10;
//���� �ӿڵĸ����÷�
public class Test6 {

	public static void main(String[] args) {
		S1 s = new Implement();
		S2 e = new Implement();
		s.save();
		e.get();
		
	}
}
interface S1 {
	void save();
}
interface S2{
	void get();
}//�ӿڼ�--�Ǽ̳й�ϵ�����ҿ��Զ�̳�(���Ÿ����Ϳ�����)
interface S3 extends S1,S2{
	void delete();//ͬʱӵ��1 2 3�ӿڵĹ���
}
//ʵ����ͽӿ� -- ��ʵ�ֹ�ϵ�����ܶ�ʵ��
 class Implement implements S1,S2{
	//��Ҫ��д1�ӿ��еĳ��󷽷����������һ��������
	//�ӿ���ķ�������public�ģ���д��Ҫע��Ȩ��
	 public void save() {
		 System.out.println("save");
	 }
	 public void get() {
		 System.out.println("get");
	 }
}
 