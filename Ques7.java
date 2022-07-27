/*7) Given a string, if the first or last chars are 'x', return the string without those 'x' chars, otherwise return the string unchanged.

If the input is "xHix", then output is "Hi".

If the input is "America", then the output is "America"*/

import java.util.Scanner;
public class Ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();

		int n1 = s1.length();


		if(s1.charAt(0)== 'x' && s1.charAt(n1-1)=='x') {

				System.out.println(s1.substring(1,n1-1));

		}
		else {
			System.out.println(s1);	
		}
	}

}
