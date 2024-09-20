package logics;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateChar {
public static void main(String[] args) {
	String str="ssgghhii";
	Set s1=new TreeSet();
	for (int i = 0; i < str.length(); i++) {
		char ch=str.charAt(i);
		s1.add(ch);
	}
	System.out.println(s1);
}
}
