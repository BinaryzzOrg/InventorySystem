import java.util.Scanner;

public class Main {
	// === FIELD VARIABLES === //
	static Scanner sc;
	static InventorySystem inventorySystem = new InventorySystem();
	static checkUserInput checkUserInput = new checkUserInput();

	// === MAIN METHOD === //
	public static void main(String[] args) {
		Menu();
	}// end class

	public static String printMenuChoices() {
		//@formatter:off
		String MenuChoicesAsString = "\n" 
				+ "  {Inventory Management}\n" 
				+ "-=======================-\n"
				+ "| (1) : Add Item \n" 
				+ "| (2) : Remove Item \n" 
				+ "| (3) : Display Inventory \n" 
				+ "| (4) : Search Inventory \n" 
				+ "| (5) : Exit \n" 
				+ "-=======================-\n"
				+ "Select an operation> ";
		//@formatter:on
		return MenuChoicesAsString;
	}// end method

	public static void Menu() {
		System.out.print(printMenuChoices());

		switch ((Integer) checkUserInput.userInput(printMenuChoices(), "Integer")) {
		case 1: {// Insert
			System.out.println();
			System.out.print("Enter an item name: ");
			String itemName =(String) checkUserInput.userInput("Enter an item name: ", "String");

			System.out.print("How many " + itemName + " to store?: ");
			int quantity = (Integer)checkUserInput.userInput("How many " + itemName + " to store?: ", "Integer");

			System.out.print("What is the " + itemName + " price?: ");
			double itemPrice =(Double) checkUserInput.userInput("What is the " + itemName + " price?: ", "Double");

			System.out.print("What is the name of the " + itemName + " manufacturer?: ");
			String manufacturer =(String) checkUserInput.userInput("What is the name of the " + itemName + " manufacturer?: ", "String");

			inventorySystem.addItem(itemName, quantity, itemPrice, manufacturer);
			break;
		}
		case 2: {// Remove Item
//			System.out.print("Enter the item's product code to remove: ");
//			int productCode = checkUserInputMenu("Enter the item's product code to remove: ");
//			inventorySystem.removeItem(productCode);
			break;
		}
		case 3: {// Display Inventory
			inventorySystem.displayItems();
			break;
		}
		case 4: {// Search Inventory
//			System.out.print("Enter the item's product code to search: ");
//			int productCode = checkUserInputMenu("Enter the item's product code to search: ");
//			inventorySystem.searchItem(productCode);
			break;
		}
		case 5: {// Exit
			System.out.println(":: Exiting now...");
			System.exit(0);
			break;
		}
		default:
		// @formatter:off
			System.out.println("\n" 
					+ "⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃\n" 
					+ "┇ Error: \n"
					+ "┇ Input is not a valid Menu choice. \n"
					+ "⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃\n" 
					+ "┇ Msg: \n"
					+ "┇ Please enter only 1 to 5 as input \n"
					+ "⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃");
			// @formatter:on
			break;
		}// end method
		Menu();
	}// end method

}// end class
