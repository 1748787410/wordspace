package day07;

public class Test1 {

	public static void main(String[] args) {
		
		//method();
		//method2();
		method3();
	}

	private static void method3() {
		//1.��������
		int [] a = {93,56,46,65,53};
		int max = a[0];
		int min = a[0];
		//2.���������ȡÿ������
		for(int i = 0; i<a.length; i++) {
			if(a[i]>max) {
				max = a[i];
			}
			if(a[i]<min) {
				min = a[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		
	}

	private static void method2() {
		//1.��������
		int [] a = {93,56,46,65,53};
		int jishu = 0;
		//2.������ȡÿ������
		for(int i = 0; i<a.length; i++) {
			//3.�ж��ǲ�������
			if(a[i]%2==1) {
			//4.��������������
			jishu = jishu + a[i];
			}
			
		}
		System.out.println(jishu);
		
	}

	private static void method() {
		//1.��������
		int [] a = {93,56,46,65,53};
		//2.������ȡÿ������
		int count = 0;//�����������¼ż������
		for(int i = 0; i<a.length; i++) {
			//3.�ж��ǲ���ż��
			if(a[i]%2==0) {
				//4.�����ż��++
				count++;
			}
		}
		System.out.println(count);
		
	}
}