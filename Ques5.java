/*5)Write a java program that accepts a string and returns a new string without the first and last character of the input string.

Example1)

i/p:Suman

o/p:um

a*/

import java.util.Scanner;
public class Ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1 = "";
		
		int n = s.length();
		for(int i=1;i<n-1;i++) {
			s1 = s1 + s.charAt(i);
		}
		System.out.println(s1);

	}

}
