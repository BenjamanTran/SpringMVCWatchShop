package DiamonShop.Entity;

public class BillDetail {
	private long id;
	private long id_product;
	private int quanty;
	private double price;
	public BillDetail(long id, long id_product, int quanty, double price) {
		super();
		this.id = id;
		this.id_product = id_product;
		this.quanty = quanty;
		this.price = price;
	}
	public BillDetail() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getId_product() {
		return id_product;
	}
	public void setId_product(long id_product) {
		this.id_product = id_product;
	}
	public int getQuanty() {
		return quanty;
	}
	public void setQuanty(int quanty) {
		this.quanty = quanty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
