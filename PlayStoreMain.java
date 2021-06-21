import java.util.*;
public class PlayStoreMain {

	public static void main(String[] args) {
		
		String contentId, userID;
		int i = 0;
		Scanner in = new Scanner(System.in);
		//Creating an object of Playstore class
		PlayStore store = new PlayStore();
		
		//Hardcode all user, Application, book, magazine, book and reviews inputs
		String[] authors1 = {"L. Tolstoy"};
        Book b1 = new Book ("b1", "War and Peace", 12.55, "The Russian Messenger", 1225, authors1);
                
        String[] authors2 = {"F. Scott Fitzgerald"};
        Book b2 = new Book ("b2", "The great gatsby", 10, "Charles Scribner's Sons", 180, authors2);
                
        String[] authors3 = {"Thomas H. Cormen", "Charles E. Leiserson", "Ronald L. Rivest", "Clifford Stein"};
        Book b3 = new Book ("b3", "Introduction to algorithms", 100, "MIT Press", 1312, authors3);
                
        Magazine m1 = new Magazine("m1", "Forbes", 8.99, "Forbes Media", 50, 201904);
        
        Application g1 = new Application("g1", "Pokemon", 5.3, "androidV4");    
        Application g2 = new Application("g2", "Pokemon", 5, "iOSV10");
        Application app1 = new Application("app1", "Calendar", "androidV3"); 
        
        User u1 = new User("u1", "John Doe", "0412000", 20);
        User u2 = new User("u2", "Mary Poppins", "0433191");  
        User u3 = new User("u3", "Dave Smith", "0413456", 1000);
        User u4 = new User("u4", "Jackie Chan", "0417654");

        Comments comment1 = new Comments(u1, "This is a fantastic game!");
        g1.addReview(comment1);
                
        Comments comment2 = new Comments(u2, "I never liked this game!");
        g1.addReview(comment2);     
        g1.addReview(new Comments(u3, "The game crashes frequently"));
        b2.addReview(new Comments(u2, "I love Tolstoy!"));
        Comments comment3 = new Comments(u2, "This is a fantastic game!");
        b1.addReview(comment3);
        
        //Pass all newly created user, Application, book, magazine, book objects to the methods in Playstore class to store them  
        store.addContent(b1);
        store.addContent(b2);
        store.addContent(b3);
        store.addContent(m1);
        store.addContent(g1);
        store.addContent(g2);
        store.addContent(app1);
        
        store.addUser(u1);
        store.addUser(u2);
        store.addUser(u3);
        store.addUser(u4);
        
        // Display the menu to take input form Playstore admin
        while(i == 0) {
        System.out.println("\nPlease select the admin task from below menu \n ");
        System.out.println("1. Upgrading a member to premium account ");
        System.out.println("2. Purchase one item for one user ");
        System.out.println("3. List all available contents ");
        System.out.println("4. Show all purchased items of a user ");
        System.out.println("5. Show all comments of a content ");
        System.out.println("6. Exit ");
        try {
        int adminInput = in.nextInt();
        
        //Below code is to perform necessary action for admin input selection
        switch(adminInput){
        case 1: store.showUsers();
        		System.out.println("\nPlease enter the UserID of a user from above ");
        		userID = in.next();
        		store.becomePremium(userID);
        		break;
        		
        case 2: System.out.println("\nPlease enter the AppID and UserID ");
        		contentId = in.next();
        		userID = in.next();
        		store.buyContent(userID, contentId);
				break;
				
        case 3: store.showContent();
				break;
				
        case 4: System.out.println("\nPlease enter the UserID of a user ");
        		userID = in.next();
        		store.showContentBought(userID);
        		break;
        		
        case 5: System.out.println("\nPlease enter the AppID");
        		contentId = in.next();
        		store.showReviews(contentId);
        		break;
        		
        case 6: i = 1;
        		System.exit(0);
        
        default: System.out.println("\nInvalid Input.please enter a valid input");
				 break;
        	
        }
        }
        catch(InputMismatchException e)
        {
        	System.out.println(" Invalid selection. Terminating the program");
        	i = 1;
        }
        }
	}

}
