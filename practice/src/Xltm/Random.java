package Xltm;


import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
		
		System.out.println("����1-100������ֿ�ʼ��Ϸ");
		int Ra = new java.util.Random().nextInt(100)+1;
		
		System.out.println();
		
		while(true){
			int sc = new Scanner(System.in).nextInt();
			
			if(sc<Ra) {
				System.out.println("̫С�ˣ��ٴ��");
			}else if(sc>Ra) {
				System.out.println("̫���ˣ���С��");
			}else {
				System.out.println("�¶���");
				break;
			}
		}
	}

	
		
	
}