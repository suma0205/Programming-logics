package logics;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDupValuesInArray {
public static void main(String[] args) {
	int[] arr= {2,2,3,4,5,5,6,6,9,0};
	Set s1=new TreeSet();
	for(int no:arr) {
		s1.add(no);
	}
	System.out.println(s1);
}
}
