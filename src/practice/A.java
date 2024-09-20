package practice;

public class A {
	int a=10;
	public static void main(String[] args) {
		A a1=new A();
		System.out.println(a1.a);
		print(a1);
	}
	static void print(A a2) {
		System.out.println(a2.a);
	}
}
