package arrayprogram;

public class SearchLetter {
	
    public static void main(String[] args)
	{
		String str = "Mumbai";
		boolean per =false;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='e')
			{
				
				per=true;
				break;
			}
		}
		System.out.println(per);
	}

}
