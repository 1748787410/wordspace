package day5.method;
//���� ��������
public class Test5 {

	public static void main(String[] args) {
		add(15,24);//����ָ���ķ���
		add2("tr");
		add3(8,4,"ate");
		add4("eks","jsl",5);
	}
	
	
	private static void add4(String e, String t, int a) {
		// +�����ã������ӺŶ���ƴ��   �ַ���+����    string+int=��string  ing��
		System.out.println(e+ t+ a);
	}


	private static void add3(int i, int j, String ad) {
		// ��һ���Ӻŵ�������������ӣ��ڶ����Ӻ���ƴ�Ӻ�����ַ���
		System.out.println(i +  j +  ad);
	}


	private static void add2(String t) {
		// TODO Auto-generated method stub
		System.out.println(t);
	}


	private static void add(int a ,int b) {
		// TODO Auto-generated method stub
		System.out.println(a);
		System.out.println(b);
	}
	//����add ()
	//���η�  ����ֵ  ������ (�������� ������){ }
	//��������  ����  ����÷�����С�����е�����ƥ��
}
