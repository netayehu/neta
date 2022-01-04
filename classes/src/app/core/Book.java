package app.core;

public class Book {
	
	private String isbn;
	private String title;
	private String auther;
	private int price;
	
public Book() { 
		
	}
	
	public Book(String isbn, String title, String auther, int price) {
		this.isbn = isbn;
		this.title = title;
		this.auther = auther;
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
