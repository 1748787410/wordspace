package day5.method;
//����  ��������ֵ
public class Test6 {

	public static void main(String[] args) {
		//2.������sum�������Ľ��
		sum(10,5);
		//3.res������sum�������Ľ��
		int res = sum(10,5);
		System.out.println(res);//�õ�15
		
		String s = add(1,5);
		System.out.println(s);
		
		int x = print ("jack",1,2);
		System.out.println(x);
	}

	private static int print(String b,int c,int d) {
		  
		  	return d+c ;
	}
	
	private static String add(int a, int b) {
		return a+b+"" ;
	}

	//����sum() --��ִ�еĽ������
	//���η� ����ֵ ������([�����б�]){ }
	//1.���������Ҫ����ֵ������ֵ��λ��- -д����ֵ������
	//voidΪ�޷���ֵ�����з���ֵ���滻Ϊ���ص�����
	private static int sum(int i, int j) {
		System.out.println(i+j);//�ó�15
		System.out.println(""+i+j);//105
		  return i+j ;//1��ʹ��return�ؼ��֣����ظ����õ�λ��
		
	}
}
