package shoppingKartusingarray;

import java.util.Scanner;

//this class is for Main menu
public class ShoppingKartOperations {
	static Scanner sc=new Scanner(System.in);
	
	//this method listed all menus
	static void AllMenus()
	{
		int choice;
		//ProductService productService=new ProductService();
		
		while(true) {
			
			System.out.println("=================================================");
		System.out.println("Enter 1. for Admin Panel\n"
				+ "Enter 2. for User Panel\n"
				+ "Enter 3. for Quit");
		
		System.out.println("=====================================================");
		choice=sc.nextInt();
		 System.out.println("====================================================");
		 
		 switch(choice)
		{
		 case 1:
			  AdminPanel.adminOperation();
			    System.out.println("=============================================");
			    break;
		 case 2:
			  UserPanel.UserOperation();
		 System.out.println("====================================================");
		 break;
		 
		 case 3:System.exit(0);
		
		
		}
		}
	
	}

}













