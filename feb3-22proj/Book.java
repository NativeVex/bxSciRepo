
/**
 * @author Artur
 *
 */
public class Book {
	private String book_name, author, category, status;
	private long isbn;
	public Book(long isbn, String book_name, String author, String category, String status){
		
	}
	public String toString(){
		return ("ISBN ID ="+isbn+" Book Name ="+book_name+" Author ="+author+" Category ="+category+" Status ="+status);
	}
	
}
//Books.txt: Contains "ISBN ID", "Book Name", "Author", "Category" (i.e., adventure, romance, textbook, etc.), "Status" (i.e., New, Excellent, Good, Bad etc.)
