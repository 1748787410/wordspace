package day03;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		System.out.println("请您输入三个数字:");
		Scanner Sc = new Scanner(System.in);
		int a = Sc.nextInt();
		int b = Sc.nextInt();
		int c = Sc.nextInt();
		int max = a > b ? (a > c ? a : c):(b > c ? b : c);
		System.out.println("三个数里的最大十："+max);

	}
}
