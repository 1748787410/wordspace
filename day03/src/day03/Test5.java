package day03;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		System.out.println("����������������:");
		Scanner Sc = new Scanner(System.in);
		int a = Sc.nextInt();
		int b = Sc.nextInt();
		int c = Sc.nextInt();
		int max = a > b ? (a > c ? a : c):(b > c ? b : c);
		System.out.println("������������ʮ��"+max);

	}
}
