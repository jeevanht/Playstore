
public class Application extends Content {

	private String osType;
	
	//Constructor for Application which has a price
	public Application(String appId, String name, double price, String osType) {
		super(appId, name, price);
		this.osType = osType;
	}
	
	//Constructor for free Application
	public Application(String appId, String name, String osType) {
		super(appId, name, 0.0);
		this.osType = osType;
	}
	
	//Add reviews for a given content
	public void addReview(Comments c) {
		//reviews = c.comment;
		setReviews(getReviews() + c.getComment() +"\n");
		
	}

	//show reviews for a given content
	public void showReviews() {
		System.out.println(getReviews());
		
	}
	}

