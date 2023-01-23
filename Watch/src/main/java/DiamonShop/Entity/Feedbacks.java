package DiamonShop.Entity;

public class Feedbacks {
	private String name;
	private String email;
	private String title;
	private String text;
	public Feedbacks(String name, String email, String title, String text) {
		super();
		this.name = name;
		this.email = email;
		this.title = title;
		this.text = text;
	}
	public Feedbacks() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
}
