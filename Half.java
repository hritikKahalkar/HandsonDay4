/*4) Write a java program that will return the first half of the string, if the length of the string is even.

It should return null for odd length string.

Example1)

i/p:TomCat

o/p:Tom

Example2)

i/p:Apron

o/p:null*/

import java.util.Scanner;
public class Half {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1 = "";
		float m = 494949.43f;
		
		int n = s.length();
		
		if(n%2==0) {
			for(int i=0;i<n/2;i++) {
				s1 = s1 + s.charAt(i);
			}
			System.out.println(s1);

		}
		else {
			System.out.println("null");
		}
	}

}
