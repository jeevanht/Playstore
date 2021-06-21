
public class Comments {
	private String user;
	private String comment;

	//Getter and setter method to impliment Encapsulation
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	//Store comments from users
	public Comments(User u, String comment) {
		this.setUser(u.getUserId());
		this.setComment(comment);
	}
}