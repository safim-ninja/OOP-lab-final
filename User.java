
public class User {
	
	protected String userId;
	protected String passwd;
	
	public User(String userId, String passwd)
	{
		this.userId = userId;
		this.passwd = passwd;
	}
	
	public void display()
	{
		System.out.println("User ID: " + this.userId);
	}
}
