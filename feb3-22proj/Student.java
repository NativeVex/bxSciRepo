/**
 * @author Artur
 *
 */
import java.util.Calendar;
import java.util.Scanner();
public class Student extends Borrower {
 public Student(String username){
  super(username);
 }

 @Override
 public void checkOut(Book in) {
   ArrayList<String>choices = new ArrayList<String>;
   Category.getKey(); 
   Scanner temp = new Scanner(System.in);
   System.out.print("Please enter the full line of information for the book that you want to check out:");
   String bookChoice = temp.next().toLowerCase();
   Book in = new Book();
   String[] info = bookChoice.split(" ");
   in.isbn = isbn.parseLong(info[1]); 
   in.book_name = info[3];
   in.author = info[5];
   in.category = info[7];
   in.status = info[9]; 
   if(status=="avalible"){
     choices.add(bookChoice);
     Calendar calStudent = Calendar.getInstance();
     System.out.println("Check Out Date:"+ calStudent.getTime());
     int Student = 14;
     calStudent.add(Calendar.DATE,Student);
     System.out.println("Student due date is :"+calStudent.getTime());
     lib.remove(in);
   }
   else 
   //public ArrayList<String> books_has = new ArrayList<String>() use this to place the books that will be checked out
   //make the due dates from the book class
   //make sure the amount ckecked is legal for that respecive student
   
  // TODO Auto-generated method stub <-Nicky&Justin
  //cannot complete until borrower completed <-Nicky

 }

 @Override
 void UI() {
  System.out.println("Successfully logged in");
   /*go to Catogory.getKey for book*/
  // TODO Auto-generated method stub <-Nicky
  //remember to only use scanner scnr, saves system resources and makes it better to close
  
 }
}