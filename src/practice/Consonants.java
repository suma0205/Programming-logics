package practice;

public class Consonants {
	public static void main(String[] args) {
		
		String str="pyaku pyaku";
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u') {
				System.out.print(ch);
			}
		}
	}
}