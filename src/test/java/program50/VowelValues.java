package program50;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class VowelValues {
	public static void main(String[] args) {
		int a[] = {10,20,30,40,50,10,20};
		Set<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			s.add(a[i]);
		}
		for (Integer x : s) {
			System.out.println(x);
		}
	}
}
