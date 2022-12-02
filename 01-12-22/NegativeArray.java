package arrayprogram;

import java.util.Scanner;

public class NegativeArray {
	private static Scanner sc;
	
	public static void main(String[] args) {
		int Size, i;	
		sc = new Scanner(System.in);
		
		System.out.print("\nPlease Enter the NEG Array size  : ");
		Size = sc.nextInt();
		int[] Neg_arr = new int[Size];
		
		System.out.format("\nEnter NEG Array %d elements : ", Size);
		for(i = 0; i < Size; i++) 
		{
			Neg_arr[i] = sc.nextInt();
		}
		
		System.out.print("\nList of Negative Numbers in NEG Array : ");
		for(i = 0; i < Size; i++) 
		{
			if(Neg_arr[i] < 0) {
				System.out.format("%d  ", Neg_arr[i]);
			}
		}
	}
}
