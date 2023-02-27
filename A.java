

// name is palindrome or not
import java.util.Scanner;
class A
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter you name");
		String name=sc.next();
		String rev=name;
		String n= " ";

		for(int i=rev.length()-1; i>=0;i--)
		{
			n=n+rev.charAt(i);

		}
		if(name.equals(n))
		{
			System.out.println("It is a palindrome name");
		}
		else
			System.out.println("it is a not palindrome name");


	}
}