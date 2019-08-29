package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Get and stores the number of items in the store: numberOfItems (integer)
		int numberOfItems = scan.nextInt();
		
		// Gets or pick the item price from the array of item prices:
		double pricePick = 0.00;
		
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
		
		// Creates an array to store the amount spent by the customer: amountSpentByCustomer (String[])
		double[] amountSpentByCustomer = new double[numberOfCustomer];
		
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
				
				// Iterates over the number of items 
				// To determine the price of each item picked by the client given an item name
				for (int x=0; x<numberOfItems; x++) {
					if (itemName.equals(itemNames[x])) {
						pricePick = pricesOfItems[x];
					}
				}
				
				// Computes and stores the amount spent by each customer:
				amountSpentByCustomer[i] += pricePick * itemQty;
			}
		}
		
		scan.close();
		System.out.println(biggestSpender(amountSpentByCustomer, customersFirstNames, customersLastNames));
		System.out.println(smallestSpender(amountSpentByCustomer, customersFirstNames, customersLastNames));
		System.out.println("Average: " + String.format("%.2f", average(amountSpentByCustomer)));
	}
	
	// Determines the average spent at the shop:
	public static double average (double[] moneySpent) {
		double average = 0;
		for (int i=0; i<moneySpent.length; i++) {
			average += moneySpent[i];
		}
		average = average/moneySpent.length;
		return average;
	}
	
	// Determines the Biggest spender:
	public static String biggestSpender(double[] amountsSpent, String[] firstNames, String[] lastNames) {
		double max = amountsSpent[0];
		String bigSpender = " ";
		for (int i = 0; i<amountsSpent.length; i++) {
			if (amountsSpent[i] > max) {
				bigSpender =  "Biggest: " + firstNames[i] + " " + lastNames[i] + " (" + String.format("%.2f", amountsSpent[i]) + ")";
			}
		}
		return bigSpender;
	}
	
	// Determines the smallest spender:
		public static String smallestSpender(double[] amountsSpent, String[] firstNames, String[] lastNames) {
			double min = amountsSpent[0];
			String smallSpender = " ";
			for (int i = 0; i<amountsSpent.length; i++) {
				if (amountsSpent[i] < min) {
					smallSpender =  "Smallest: " + firstNames[i] + " " + lastNames[i] + " (" + String.format("%.2f", amountsSpent[i]) + ")";
				}
			}
			return smallSpender;
		}
}
