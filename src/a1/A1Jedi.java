package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Get and stores the number of items in the store: numberOfItems (integer)
		int numberOfItems = scan.nextInt();
		
		int[] totalOfItemsPerCustomer = new int [numberOfItems];
		int[] totalOfCustomersPerItem = new int [numberOfItems];
		

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
		
		/*
		 	Iterates over the number of customers to get the customers info.
		 */
		for(int i=0; i<numberOfCustomer; i++) {
			
			boolean[] checkItemName = new boolean[numberOfItems];
			
			// Gets each customers first names and stores it in the ith position of the array: 
			customersFirstNames[i] = scan.next();
			
			// Gets each customer last name and stores it in the ith position of the array:
			customersLastNames[i] = scan.next();
			
			int numberOfItemsBoughtByCustomer = scan.nextInt();

			int[] itemQtys = new int[numberOfItemsBoughtByCustomer];
			String[] selectedItem = new String[numberOfItemsBoughtByCustomer];
			
			// Iterates over each itemQtys to get the name and quantity of every item bought:
			for(int j=0; j<numberOfItemsBoughtByCustomer; j++) {
				
				itemQtys[j] = scan.nextInt();
				selectedItem[j] = scan.next();
				
				for (int x=0; x<numberOfItems; x++) {
					
					if (selectedItem[j].equals(itemNames[x])) {
						
						if (!checkItemName[x]) {
							
							totalOfCustomersPerItem[x] += 1;
							checkItemName[x] = true;	
						}
						
						totalOfItemsPerCustomer[x] += itemQtys[j];
					}
				}
			}
		}
		
		for (int i = 0; i< numberOfItems; i++) {
			if (totalOfItemsPerCustomer[i] == 0) {
				System.out.println("No customers bought " + itemNames[i]);
			}
			else {
				System.out.println(totalOfCustomersPerItem[i] + " customers bought " + totalOfItemsPerCustomer[i] + " " + itemNames[i]);
			}
		}
		
		scan.close();
	
	}
}
