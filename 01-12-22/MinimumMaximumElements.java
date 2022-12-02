package arrayprogram;

public class MinimumMaximumElements {
	
	public static void main(String[] args)
	{
		int a[]= {50,100,40,20,60,90};
		int min=a[0];
		int max= a[0];
		for(int i= 0;i< a.length;i++)
		{
			if(a[i]> max)
				max= a[i];
			if(a[i]< min)
				min= a[i];
		}
		System.out.println("Max value" +max);
		System.out.println("Min value" +min);
	}
}
		
	
		
	
	