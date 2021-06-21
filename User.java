
public class User {
	private String userId;
	private String userName;
	private String phoneNumber;
	private double amountBalance;
	private boolean premium;
	private String appsBought;
	
	//Constructor for user with specific initial amount
	public User(String userId, String userName, String phoneNumber, double amountBalance) {
	this.setUserId(userId);
	this.setUserName(userName);
	this.phoneNumber = phoneNumber;
	this.amountBalance = amountBalance;
	premium = false;
	appsBought = "";
	}
	
	//Constructor for user with default $500 initial amount
	public User(String userId, String userName, String phoneNumber) {
	this.setUserId(userId);
	this.setUserName(userName);
	this.phoneNumber = phoneNumber;
	this.amountBalance = 500.0;
	premium = false;
	appsBought = "";
	}
	
	//Buy a content for a user
	public boolean buyContent(Content con ) {
		double cost = con.getPrice();
		//Check if the user is a premium user and reduce the price by 20% if he is.
		if(premium) {
			cost = cost - (cost*20/100);
		}
		//check if the user have enough amount balance to buy a content
		if(amountBalance >= cost) {
			amountBalance-= cost;
			//appsBought.concat(c.appId + "\n");
			appsBought = appsBought + con.getAppId() + "\n";
			con.setNumberOfDownloads(con.getNumberOfDownloads() + 1);
			System.out.println("User " + userId + " purchased content " + con.getAppId()+ " successfully\n");
			System.out.println(amountBalance + "\t is the current balance for this user ");
			return true;
		}
		else {
			System.out.println("User " + userId + " doesn't have sufficient balance to purchase this content\n");
			return false;
		}
	}
	
	//To make a member premium
	public boolean becomePremium() {
		//Check if the user has enough balance to become premium
		if(amountBalance >= 100) {
			//Check if the member is already a premium member
			if(!premium) {
				amountBalance-= 100.00;
				premium = true;
				System.out.println("\nUser " + userId + " is now a premium member");
				return true;
			}
			else {
				System.out.println("\nUser " + userId + " is already a premium member");
				return false;
			}
			
		}
		else { 
			System.out.println("User " + userId + " doesn't have sufficient balance to become a premium member");
			return false;
		}
	}
	
	//Getter and setter method to impliment Encapsulation
	public void showContentBought() {
		System.out.println(appsBought + "are the contents bought by user " + userId + "\n");
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	} 

	
	public double getAmountBalance() {
		return amountBalance;
	}

	public void setAmountBalance(double amountBalance) {
		this.amountBalance = amountBalance;
	}

}
