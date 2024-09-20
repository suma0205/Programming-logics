package practice;

public class Diserium {
	public static void main(String[] args) {
		int no=135;
		int n1=no;
		int n2=no;
		int count=0;
		int sum=0;
		while(n1!=0) {
			n1=n1/10;
			count++;
		}
		while(n2!=0) {
			int rem=n2%10;
			sum+=Math.pow(rem, count);
     		count--;
			n2=n2/10;
			
		}
		if(sum==no) {
			System.out.println("diserium");
		}
		else {
			System.out.println("not a diserium");
		}
	}
}
