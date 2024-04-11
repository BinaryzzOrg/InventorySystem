public class InventorySystem {
	// === FIELD VARIABLES === //
	private Node root;
	private Node tail;
	private int productCode = 1;

	// === CONSTRUCTOR === //
	public InventorySystem() {
		this.root = null;
		this.tail = null;
	}// end constructor

	// === INVENTORY METHODS === //
	public void addItem(String itemName, int quantity, double price, String manufacturer) {
		Item item = new Item(productCode++, itemName, quantity, price, manufacturer);
		Node itemNode = new Node(item);

		if (root == null) {
			root = itemNode;
			tail = itemNode;
		} else {
			tail.setNext(itemNode);
			tail = itemNode;
		} // end if else
	}// end method

	public void removeItem(int productCode) {

		Node itemNode = root;
		if (root == null) {
			printEmptyInventory();
			return;
		} // end if

		if (productCode == itemNode.getData().getProductCode()) {
			root = itemNode.getNext();
			System.out.println("\n=== Item Successfully Deleted! ===");
			return;
		} // end if

		while (itemNode != null && itemNode.getNext() != null) {

			if (productCode == itemNode.getNext().getData().getProductCode()) {
				System.out.println("\n=== Item Successfully Deleted! ===");
				itemNode.setNext(itemNode.getNext().getNext());
				return;
			} // end if
			itemNode = itemNode.getNext();
		} // end while

		System.out.println("\n==== Item Not Found! ====");
	}// end method

	public void searchItem(int productCode) {
		Node itemNode = root;

		if (root == null) {
			printEmptyInventory();
			return;
		} // end if

		while (itemNode != null) {
			if (productCode == itemNode.getData().getProductCode()) {

				System.out.println("\n==== Product Code Found! ==== ");
				printInventory(itemNode);
				return;
			} // end if
			itemNode = itemNode.getNext();
		} // end while
		System.out.println("\n==== Item with that Product Code was not found! ====");
	}// end method

	public void displayItems() {
		Node itemNode = root;

		if (root == null) {
			printEmptyInventory();
			return;
		} // end if

		System.out.println("\n==== INVENTORY ITEMS ====");
		while (itemNode != null) {
			printInventory(itemNode);
			itemNode = itemNode.getNext();
		} // end while
	}// end method

	// === OTHER METHODS === //
	public void printInventory(Node itemNode) {
		// @formatter:off
			System.out.println("Product Code: " +itemNode.getData().getProductCode()+"\n"
							+"Item Name: " + itemNode.getData().getProductName() + "\n"
							+"Quantity in Stock: " + itemNode.getData().getQuantity() + "\n"
							+"Price: " + itemNode.getData().getPrice() + "\n"
							+"Manufacturer: " + itemNode.getData().getManufacturer() + "\n");
		// @formatter:on
	}// end method

	public void printEmptyInventory() {
		//@formatter:off
			System.out.println("\n"+
					"⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃\n" +
					"┇ Inventory is currently empty, Please add an item.\n" +
					"⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃⁃\n");
			//@formatter:on
	}// end method

}// end class
