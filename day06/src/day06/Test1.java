package day06;
//����  ����Ĵ���
public class Test1 {

	public static void main(String[] args) {
		char[] a = new char [5];//���޸ĵ�char����Ĭ��Ϊ/u0000���߿ո�
		
		 a[0] = 'h';
		 a[1] = 'e';
		 a[2] = 'l';
		 a[3] = 'l';
		 a[4] = 'o';
		 
		 char[] b = new char []{'h','e','l','l','o'};
	
		 //�����˲����ڵ��±꣬�ͻᱨ�������±�Խ��
		 //java.lang.ArrayIndexOutOfBoundsException:5
		 	//System.out.println(a[5]);
		 System.out.println(a);
			 		
		 	   }
	}		

