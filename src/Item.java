public class Item {
	// === FIELD VARIABLES === //
	private int productCode;
	private String productName;
	private int quantity;
	private double price;
	private String manufacturer;

	public Item(int productCode, String productName, int quantity, double price, String manufacturer) {
		this.productCode = productCode;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
		this.manufacturer = manufacturer;
	}// end constructor

	// === GETTER SETTERS === //
	public int getProductCode() {
		return productCode;
	}

	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
}