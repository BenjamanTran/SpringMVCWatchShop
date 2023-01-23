package DiamonShop.Entity;

public class Slides {
	private int id;
	private String imgString;
	private String captionString;
	private String contentString;
	public Slides(int id, String imgString, String captionString, String contentString) {
	
		this.id = id;
		this.imgString = imgString;
		this.captionString = captionString;
		this.contentString = contentString;
	}
	public Slides() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImgString() {
		return imgString;
	}
	public void setImgString(String imgString) {
		this.imgString = imgString;
	}
	public String getCaptionString() {
		return captionString;
	}
	public void setCaptionString(String captionString) {
		this.captionString = captionString;
	}
	public String getContentString() {
		return contentString;
	}
	public void setContentString(String contentString) {
		this.contentString = contentString;
	}
	
}
