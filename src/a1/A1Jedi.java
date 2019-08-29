package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Get and stores the number of items in the store: numberOfItems (integer)
		int numberOfItems = scan.nextInt();
		
		// Stores the number of customers that bought a particular item:
		int numberOfCustomers = 0;

		// Create an array to store the items or product names: itemNames (String[])
		String[] itemNames = new String[numberOfItems];
		
		// Create an array to store the item or product prices: pricesOfItems (doubles[])
		double[] pricesOfItems = new double[numberOfItems];
		
		// Iterate over the number of items in the store to get the items info:
		for (int i=0; i<numberOfItems; i++) {
			
			// Get and store the items names into itemsNames:
			itemNames[i] = scan.next();
			
			// Get and store the item prices into pricesOfItems:
			pricesOfItems[i] = scan.nextDouble();
		}
		
		// Get and stores the number of customers: numberOfCustomers (integer)
		int numberOfCustomer = scan.nextInt();
		
		// Create an array to store the customers first names: customersFirstNames (String[])
		String[] customersFirstNames = new String[numberOfCustomer];
		
		// Creates an array to store the customers last names: customersLastNames (String[])
		String[] customersLastNames = new String[numberOfCustomer];
		
		// Creates an array to store the QTY of items bought by each customer: itemCount (int[])
		int[] itemCount = new int[numberOfCustomer];
		
		/*
		 	Iterates over the number of customers to get the customers info.
		 */
		for(int i=0; i<numberOfCustomer; i++) {
			
			// Gets each customers first names and stores it in the ith position of the array: 
			customersFirstNames[i] = scan.next();
			
			// Gets each customer last name and stores it in the ith position of the array:
			customersLastNames[i] = scan.next();
			
			// Gets each customers count for items bought and stores it in the ith position of the array:
			itemCount[i] = scan.nextInt();
			
			// Iterates over each itemQtys to get the name and quantity of every item bought:
			for(int j=0; j<itemCount[i]; j++) {
				
				// Gets the qty of each item:
				int itemQty = scan.nextInt();
				
				// Gets the name of the item:
				String itemName = scan.next();
			}
		}
		
		scan.close();
	
	}
}
