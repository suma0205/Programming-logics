package logics;

public class DiamondStar {
	public static void main(String[] args) {
	
		for (int i = 1; i <=5; i++) {
			for (int k = 4; k >=i; k--) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		//reversed diamond
		for (int i = 1; i <=5; i++) {
			for (int k = 1; k <=i; k++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <=5-i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
}
}
