package logics;

import java.util.Scanner;

public class NthPrime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		int no=1,count=0,i;
		while(count<n)
		{
			no=no+1;
			for (i=2; i<=no; i++) 
			{
				if(no%i==0) 
				{
					break;
				}
			}
			if(i==no) 
			{
				count=count+1;
			}
		}
		System.out.println("The "+n+"th prime no is "+no);
	}
}
