package arrayprogram;

import java.util.Scanner;

public class CompareString {
	public static void main(String[] args)
	{
		String str1;
		String str2;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the First String: ");
		str1 = scan.nextLine();
		
		System.out.print("Enter the Second String: ");
		str2 = scan.nextLine();
		
		if(str1.equals(str2))
			System.out.println("Both Strings are equal. ");
		else
			System.out.println("Both Strings are not equal. ");
	}
	
}
		
		
			
			
		
		
	


