
public class Book extends Publication{

	String[] authorName;
	
	//Constructor for Book which has a price
	public Book(String appId, String name, double price, String publisher, int numberOfPages, String[] authorName) {
		super(appId, name, price, publisher, numberOfPages);
		this.authorName = authorName;
	}
	
	//Constructor for a free Book
	public Book(String appId, String name, String publisher, int numberOfPages, String[] authorName) {
		super(appId, name, 0.0, publisher, numberOfPages);
		this.authorName = authorName;
	}
	

}
