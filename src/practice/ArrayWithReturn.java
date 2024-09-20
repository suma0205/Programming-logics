package practice;

public class ArrayWithReturn {
	static int[] print()
	{
		int[] arr= {10,20,30,40};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] abb=print();
	}
}
