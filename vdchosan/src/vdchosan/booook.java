package vdchosan;
import java.util.Scanner;
class booook {
	String author;
	String title;
	int pages;
	double price;
	
	booook(String title, String author, int pages, double price){
		this.title = title;
		this.author = author;
		this.pages = pages;
		this.price = price;
	}
    
	public booook() {
	}
	
	String getTitle() {
		return title;
	}
	
	String getAuthor() {
		return author;
	}
	
	int getPages() {
		return pages;
	}
	
	double getPrice() {
		return price;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setTitle(String tile) {
		this.title = title;
	}
	
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return "Book{" + "title=" + this.getTitle() + ", author=" + this.getAuthor() + ", pages=" + this.getPages() + ", price=" + this.getPrice() + "}";
	}
	
	void updatePrice(double rate) {
		this.price = price * (1 + rate);
	}
	
	
	public static void main(String[] args) {
		booook b = new booook();
		Scanner scan = new Scanner(System.in);
	    System.out.println("Please input the title of the book: ");
	    b.setTitle(scan.nextLine());
	    System.out.println("book's author: ");
	    b.setAuthor(scan.nextLine());
	    System.out.println("book's total pages: ");
	    b.setPages(scan.nextInt());
	    System.out.println("book's price: ");
	    b.setPrice(scan.nextDouble());
	    System.out.println("The book's information" + b.toString());
	    System.out.println("How much discount?");
	    b.updatePrice(scan.nextDouble());
	    System.out.println("After update price, the book's information: "+b.toString());
	}
}

