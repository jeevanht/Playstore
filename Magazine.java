
public class Magazine extends Publication{

	private int volume;
	
	//Constructor for Magazine which has a price
	public Magazine(String appId, String name, double price, String publisher, int numberOfPages, int volume) {
		super(appId, name, price, publisher, numberOfPages);
		this.volume = volume;
	}

	//Constructor for free Magazine which
	public Magazine(String appId, String name, String publisher, int numberOfPages, int volume) {
		super(appId, name, 0.0, publisher, numberOfPages);
		this.volume = volume;
	}
}
