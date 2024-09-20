package logics;

import java.util.Scanner;

public class FactorialOfAnyNo {
	public static void main(String[] args) {
		int no,fact=1;
		System.out.println("Input Number :");
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
		for (int i = 1; i <=no; i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+no+" is : "+fact);
	}
}
