/*8) Write a Java program that accepts a string (with * in it). The program should return a new string in which the following characters are removed-*,the characters that are to the left and right of *

Example1)

i/p:ab*cd

o/p:ad


*/

import java.util.Scanner;
public class Ques8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ans ="";
		int n = s.length();
		for(int i=0;i<n;i++) {
			if(s.charAt(i)=='*') {
				ans = ans.substring(0,i-1);
				i++;
			}
			else {
				ans = ans + s.charAt(i);
			}
		}
		System.out.println(ans);
	}

}
