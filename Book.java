public class Book{
  public String isbn;
  public String book_name;
  public String author;
  public String category;
  public String status;
 
  public Book(String isbn, String book_name, String author, String category, String status){
    this.author = author;
    this.book_name = book_name;
    this.isbn = isbn;
    this.category = category;
    this.status = status;
 }
 
 @Override
 public String toString(){
  return ("ISBN#="+isbn+" BookName="+book_name+" Author="+author+" Category="+category+" Status="+status);
 }
 
  }
 
