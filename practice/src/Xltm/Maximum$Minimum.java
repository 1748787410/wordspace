package Xltm;

public class Maximum$Minimum {

	public static void main(String[] args) {
		int num[] = new int[] {18,22,77,64,95,24,38,67,15};
		
		int numMax = num[0];
		int numMin = num[0];
		
		for(int i = 0; i<num.length; i++) {
			if(num[i]>numMax) {
				numMax=num[i];
			}
			if(num[i]<numMin) {
				numMin=num[i];
			}
		}
		System.out.println("最大值是："+numMax);
		System.out.println("最小值是："+numMin);
	}
}
