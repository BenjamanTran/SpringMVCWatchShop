package DiamonShop.Entity;

public class Categorys {
	private int id;
	private String nameString;
	private String description;
	public int getId() {
		return id;
	}
	public Categorys(int id, String nameString, String description) {
		
		this.id = id;
		this.nameString = nameString;
		this.description = description;
	}
	public Categorys() {
		super();
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
