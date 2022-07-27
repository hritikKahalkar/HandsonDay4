/*1) Write a Program to check whether a given String is Palindrome or not.*/
public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="radar",s2="";
		int n = s1.length();
		for(int i = (n-1);i>=0;--i) 
		{
			s2 = s2 + s1.charAt(i);
			}
		if(s1.equals(s2)) {
			System.out.println("It is pallindrome");
		}
		else {
			System.out.println("It isn't pallindrome");
		}

	}

}
