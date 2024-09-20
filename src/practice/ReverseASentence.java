package practice;

public class ReverseASentence {
	public static void main(String[] args) {
		
		String str="I LOVE MS DHONI";
		String[] s1=str.split(" ");
		for (int i =s1.length-1;i>=0; i--) {
			System.out.print(s1[i]+" ");
		}
	}
}