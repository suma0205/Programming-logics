package logics;

public class UniqueChar {

	static void print(String str) {
		char[] ch=str.toCharArray();
		for(char c:ch) {
			if(str.indexOf(c)==str.lastIndexOf(c)) {
				System.out.print(c+" ");
			}
		}
	}
	public static void main(String[] args) {
		print("wererytyuiopljkhgbcv");
	}
}
