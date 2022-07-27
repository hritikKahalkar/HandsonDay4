/*3) Given a string, return a new string made of 'n' copies of the first 2 chars of the original string

where 'n' is the length of the string.

Example1)

i/p:Hello

o/p:HeHeHeHeHe
*/

import java.util.Scanner;
public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1 = "", s2 = "";
		
		int n = s.length();
		for(int i=0;i<=1;i++) {
			s1 = s1 + s.charAt(i);
		}
		s2 = s1;
		for(int j=1;j<n;j++) {
			s1 = s1.concat(s2);
		}
		System.out.println(s1);

	}

}
