/*2) Write a java program that will concatenate 2 strings and return the result.

The result should be in lowercase.

Note:If the concatenation creates a double-char, then one of the characters need to be omitted.

Example1)

i/p:Sachin,Tendulkar

o/p:sachin tendulkar

Example2)

i/p:Mark,kate

o/p:markate
*/

public class Concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Sachin", s2 = "Tendulkar";
		int n1 = s1.length();
		int n2 = s2.length();
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		String s3 = s1;
		if((s1.charAt(n1-1)==s2.charAt(0))){
			for(int i=1;i<n2;i++) {
				
				s3 = s3+s2.charAt(i);
			}			
		}
		else {
			s3 = s1.concat(s2);
		}
		System.out.println(s3);
	}

}
