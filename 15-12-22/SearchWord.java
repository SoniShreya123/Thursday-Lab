package arrayprogram;

import java.util.Scanner;

public class SearchWord {
	
	public static void main(String[] args)
	{
		
		String str;
		char ch='I';
		int i=1;
		
		
		System.out.println("I love my India");
		Scanner sc =new Scanner(System.in);
		str=sc.nextLine();
		
		for(i=1;i<str.length();i++)
		{
			if(ch==str.charAt(i))
			{
				break;
			}
		}
		
		System.out.println(ch); //4
		
	}
	
}