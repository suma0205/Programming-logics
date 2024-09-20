package logics;

public class aTwobThreecFive {
	public static void main(String[] args) {
		String str="a2b4c3";
		char[] ch=str.toCharArray();
		for (int i = 0; i < ch.length; i=i+2) {
			print(ch[i],ch[i+1]);
		}	
	}
	static void print(char c1, char c2) {
		int no=(int)(c2-48);
		for (int i = 1; i <=no; i++) {
			System.out.print(c1);
		}
	}
}
