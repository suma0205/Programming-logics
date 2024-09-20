package logics;

import java.util.Random;

public class RandomNumbers {
	public static void main(String[] args) {
		Random ran=new Random();
        System.out.println("Random numbers :");
        for (int i = 0; i <=5; i++) {
		System.out.println(ran.nextInt(40));
		}
	}
}

