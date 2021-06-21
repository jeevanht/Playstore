
public abstract class Content {
	private String appId;
	private String name;
	private int numberOfDownloads;
	private double price;
	private String reviews;
	
	//Constructor for Content class
	public Content(String appId, String name, double price ) {
		this.setAppId(appId);
		this.setName(name);
		this.setPrice(price);
		setNumberOfDownloads(0);
		reviews = "";
	}
	
	//Below are the getter and setter methods for all private attributes to impliment Encapsulation
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public int getNumberOfDownloads() {
		return numberOfDownloads;
	}

	public void setNumberOfDownloads(int numberOfDownloads) {
		this.numberOfDownloads = numberOfDownloads;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getReviews() {
		return reviews;
	}

	public void setReviews(String reviews) {
		this.reviews = reviews;
	}
	
	//Below are the abstract methods to fetch and store reviews for respective contents
	public abstract void addReview(Comments c);
	public abstract void showReviews();
}
