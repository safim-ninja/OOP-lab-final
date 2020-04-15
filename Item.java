
public class Item {
	
	private String itemName;
	private double price;
	
	public Item(String itemName, double price) {
		this.setItemName(itemName);
		this.setPrice(price);
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void display() {
		
		System.out.println("Name of the item is: " + this.itemName + "Price of item: " + this.price);
		
	}

}
