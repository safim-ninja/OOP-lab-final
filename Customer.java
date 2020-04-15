
public class Customer extends User {
	
	private String name;
	private String email;
	
	public Customer(String userId, String passwd, String name, String email) {
		super(userId, passwd);
		this.name = name;
		this.email = email;
	}

	public static void main(String[] args) {
		
		Item iths = new Item("KitKat", 250);
		Customer ussg = new Customer("zayan.123", "zhg878", "Zayan", "zayan@gmail.com");
		
		System.out.println(ussg.name + " bought " + iths.getItemName() + " at cost of TK " + iths.getPrice());
		
	}

}

