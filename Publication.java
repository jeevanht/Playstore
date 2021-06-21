
public class Publication extends Content {
	
	private String publisher;
	private int numberOfPages;
	
	//Constructor for Publication class
	public Publication(String appId, String name, double price, String publisher,int numberOfPages) {
		super(appId, name, price);
		this.publisher = publisher;
		this.numberOfPages = numberOfPages;
	}

	public void addReview(Comments c) {
		setReviews(c.getComment());
		
	}

	public void showReviews() {
		System.out.println(getReviews());
	}

}
