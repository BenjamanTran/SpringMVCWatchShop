package DiamonShop.Entity;

public class Accounts {
	private int id;
	private String user;
	private String password;
	private String displayName;
	private String address;
	private Boolean isAdmin;
	public Accounts(int id, String user, String password, String displayName, String address, Boolean isAdmin) {
		super();
		this.id = id;
		this.user = user;
		this.password = password;
		this.displayName = displayName;
		this.address = address;
		this.isAdmin = isAdmin;
	}
	
	public Accounts(int id, String user, String password, String displayName, String address) {
		super();
		this.id = id;
		this.user = user;
		this.password = password;
		this.displayName = displayName;
		this.address = address;
		
	}
	public Accounts(String user, String password, String displayName, String address) {
		super();
		this.user = user;
		this.password = password;
		this.displayName = displayName;
		this.address = address;
		
	}
	public Accounts(String user, String password) {
		super();
		this.user = user;
		this.password = password;
		
		
	}
	public Accounts() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Boolean getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	@Override
	public String toString() {
		return "Accounts [id=" + id + ", user=" + user + ", password=" + password + ", displayName=" + displayName
				+ ", address=" + address + ", isAdmin=" + isAdmin + "]";
	}
	
	
}
