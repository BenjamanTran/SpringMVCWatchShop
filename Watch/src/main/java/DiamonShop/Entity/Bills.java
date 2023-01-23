package DiamonShop.Entity;

import java.sql.Date;

public class Bills {
	private long id;
	private int id_user;
	private String email;
	private String fullName;
	private String address;
	private double total;
	private String phone;
	private String note;
	private Date checkoutDate;
	public Bills(long id, int id_user, String email, String fullName, String address, double total, String phone,
			String note, Date checkoutDate) {
		super();
		this.id = id;
		this.id_user = id_user;
		this.email = email;
		this.fullName = fullName;
		this.address = address;
		this.total = total;
		this.phone = phone;
		this.note = note;
		this.checkoutDate = checkoutDate;
	}
	public Bills() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Date getCheckoutDate() {
		return checkoutDate;
	}
	public void setCheckoutDate(Date checkoutDate) {
		this.checkoutDate = checkoutDate;
	}
	@Override
	public String toString() {
		return "Bills [id=" + id + ", id_user=" + id_user + ", email=" + email + ", fullName=" + fullName + ", address="
				+ address + ", total=" + total + ", phone=" + phone + ", note=" + note + ", checkoutDate="
				+ checkoutDate + "]";
	}
	
	
}
