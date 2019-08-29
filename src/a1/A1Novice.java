package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		/*
		 	This program will read in data that represents 
		 	shopping orders from a number of customers
		 	and report the total amount spent on a per customer basis. 
		 	__________________________________________________________
		 
		 	Getting the number of customers by the user.
		 	Storing the number of customers.
		 	numberOfCustomers (integer). 
		 */
		
		int numberOfCustomers = scan.nextInt();
		
		
		/*
			Iterate over the number of customers to get all the customer info:
			customerFirstName (String)
			customerLastName (String)
			numberOfItemsBought (integer)
		 */
		
		for( int i=0; i<numberOfCustomers;i++) {
			
			// Holds the total spent by customer: totalSpent (double)
			double totalSpent = 0;
			
			// Customer First Name:
			String customerFirstName = scan.next();
			
			// Customer Last Name:
			String customerLastname = scan.next();
			
			// Number of Items Bought:
			int numberOfItemsBought = scan.nextInt();
			
			/*
			 	Iterates over the number of Items Bought by the customer to get the products info.
			 	itemQty (integer)
			 	nameOfItem (String)
			 	priceOfItem (double)
			 	
			 	Compute the total spent by customer.
			 */
			
			for (int j=0; j<numberOfItemsBought; j++) {
				
				// Item Qty:
				int itemQty = scan.nextInt();
				
				// Item Name::
				String nameOfItem = scan.next();
				
				// Item price:
				double itemPrice = scan.nextDouble();
				
				
				totalSpent += itemQty * itemPrice;
				
				
			}
			
			//Using infoOutput to display customer info:
			infoOutput(customerFirstName, customerLastname, totalSpent);
		}
		
		
		
		scan.close();
		
	}
	
	// Displays each customer output into the desire layout:
	public static void infoOutput(String firstName, String lastName, double total) {
		System.out.println(firstName.charAt(0) + ". " + lastName + ": " + String.format("%.2f", total));
	}
}
