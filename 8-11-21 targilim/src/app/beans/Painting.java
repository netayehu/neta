package app.beans;

public class Painting {
	
	private int id;
	private int price;
	private String title;
	private String artist;
	
	public Painting() {
		
	}
	
	public Painting(int id, int price, String title, String artist) {
		super();
		this.id = id;
		this.price = price;
		this.title = title;
		this.artist = artist;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	
	
	

}
