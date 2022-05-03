package corejava;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str,rev="";
		char temp;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the String : ");
		str=s.next();
		for(int i=str.length()-1;i>-1;i--)
		{
			temp=str.charAt(i);
			rev=rev+temp;
		}
		if(str.equals(rev))
		{
			System.out.print("It is a palindrome.");
		}
		else
		{
			System.out.print("It is not a palindrome.");
		}
		s.close();
	
	
		/*int num=12321,rev=0,rem;
		int temp=num;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(num==rev)
		{
			System.out.print("It is a palindrome.");
		}
		else
		{
			System.out.print("It is not a palindrome.");
		}*/

	}

}
