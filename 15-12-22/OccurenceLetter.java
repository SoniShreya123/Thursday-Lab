package arrayprogram;

public class OccurenceLetter {
	public static void main(String[] args)
	{
		String str="Hello"; //take a String
		char ch='o'; //take a character
		
		int occurence=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
			{
				occurence++;
			}
		}
		
System.out.println("Occurence of char is "+ch +" is " +occurence); //print
	}

}
