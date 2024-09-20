package logics;

public class AvgArrayElements {
	public static void main(String[] args) {
		int[] arr= {12,45,68,99,6,8};
		int avg=0;
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		avg=sum/arr.length;
		System.out.println("The average of given Array is "+avg);
	}
}
