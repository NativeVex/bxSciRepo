import java.util.Date;

/**
 * @author Artur
 *
 */
public class Book {
	private String book_name, author, category, status;
	private long isbn;
	private Date time_of_checkout;
	public Book(long isbn, String book_name, String author, String category, String status){
		this.setTime_of_checkout(new Date());
		this.author = author;
		this.book_name = book_name;
		this.isbn = isbn;
		this.category = category;
		this.status = status;
	}
	/**
	 * Returns the Books.txt format of the book
	 */
	@Override
	public String toString(){
		return ("ISBN ID ="+isbn+" Book Name ="+book_name+" Author ="+author+" Category ="+category+" Status ="+status+" Time of most recent checkout"+ time_of_checkout.toString());
	}
	/**
	 * Get most recent time book was entered into the library
	 * @return
	 */
	public Date getTime_of_checkout() {
		return time_of_checkout;
	}
	/**
	 * Set time of checkout: do not use unless book is being re-borrowed
	 * @param time_of_checkout
	 */
	public void setTime_of_checkout(Date time_of_checkout) {
		this.time_of_checkout = time_of_checkout;
	}
	
}
//Books.txt: Contains "ISBN ID", "Book Name", "Author", "Category" (i.e., adventure, romance, textbook, etc.), "Status" (i.e., New, Excellent, Good, Bad etc.)
