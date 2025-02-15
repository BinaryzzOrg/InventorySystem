public class Node {

	// === FIELD VARIABLES === //
	private Item data;
	private Node next;

	public Node(Item data) {
		setData(data);
		setNext(null);
	}// end constructor

	// === GETTER SETTERS === //
	public Item getData() {
		return data;
	}

	public void setData(Item data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}