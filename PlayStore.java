import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;
public class PlayStore {
	private HashMap<String, Content> contents = new HashMap<String, Content>();
	private HashMap<String, User> users = new HashMap<String, User>();
	
	
	//To store Content object in Hashmap with respect to contentId key
	public void addContent(Content content) {

		contents.put(content.getAppId(), content);
	}
	
	//To store user object in Hashmap with respect to userId key
	public void addUser(User user) {
		
		users.put(user.getUserId(), user);
	}
	
	//Show the list of users registers to playstore with user information
	public void showUsers() {
		System.out.println("\n\nBelow are the registered users to Playstore\n");
		System.out.println("Sl No\tUserID\tName\t\tBalance Amount");
		int i = 1;
		for(User u:users.values()){
		  System.out.println(i + ".\t" + u.getUserId() + "\t"  + u.getUserName()+"\t"+ u.getAmountBalance());
		  i++;
		} 
		
	}
	
	//Show the list of all available contents in playstore and catogory wise as well
	public void showContent() {
		
		System.out.println("\n\nBelow are the Contents available in Playstore\n");
		int i = 1;
		for(Content t:contents.values()){
		  System.out.println(i + ".\t" + t.getName());
		  i++;
		}
		
		//Show contents which are application 
		System.out.println("\n\nBelow are the Applications currently available in Playstore\n");
		i = 1;
		for(Content t:contents.values()){
			if(t instanceof Application) {
				  System.out.println(i + ".\t" + t.getName());
				  ++i;
			}
		}
		
		//Show contents which are Books 
		System.out.println("\n\nBelow are the Books currently available in Playstore\n");
		i = 1;
		for(Content t:contents.values()){
			if(t instanceof Book) {
				  System.out.println(i + ".\t" + t.getName());
				  ++i;
			}
		}
		
		//Show contents which are Magazines 
		System.out.println("\n\nBelow are the Magazines currently available in Playstore\n");
		i = 1;
		for(Content t:contents.values()){
			if(t instanceof Magazine) {
				  System.out.println(i + ".\t" + t.getName());
				  ++i;
			}
		}
		
	}
	
	//Show reviews for the given content
	public void showReviews(String a) {
		try {
		Content con = contents.get(a);
		con.showReviews();
		}
		catch(NullPointerException e) {
			System.out.println("Please enter a valid content ID");
		}
	}
	
	//By content for a user for given appId
	public void buyContent(String b, String c) {
		Content con;
		User u;
		//Check for invalid user and content entered
		try {
		con = contents.get(c);
		u = users.get(b);
		u.buyContent(con);
		}
		catch(NullPointerException e1)
		{
			System.out.print(" Invalid Content ID or User ID  ");
		}
		
	}
	
	//Show all content bought
	public void showContentBought(String d) {
		//Check for invalid user
		try {
		User u = users.get(d);
		u.showContentBought();
		}
		catch (NullPointerException e1) {
			  System.out.print(" Invalid User ID "); 
		}
	}
	
	//To make a user premium member
	public void becomePremium(String e) {
		//Check for invalid user
		try {
		User u = users.get(e);
		u.becomePremium();
		}
		catch (NullPointerException e1) {
			  System.out.print(" Invalid User ID "); 
		}
	}

}
