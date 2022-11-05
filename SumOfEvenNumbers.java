package basicprogram;

import java.util.Scanner;

public class SumOfEvenNumbers {
	 public static void main(String[]args)  {
		 int number, i;
		 Scanner sc= new Scanner(System.in);
		 
		 System.out.println("Enter the number");
		 number= sc.nextInt();
		 
		 for(i = 1; i <= number; i++)
		 {
			  if(i % 2==0)
			  {
				  System.out.println(i +"\t");
			  }
		 }
	 }
}
	
	
	
	



