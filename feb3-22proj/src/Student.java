/**
 * @author Artur
 *
 */
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Scanner;
public class Student extends Borrower {
 public Student(String username){
  super(username);
 }

 @Override
 public void checkOut(Book in) {
   ArrayList<String>choices = new ArrayList<String>();
   Category.getKey(); 
   Scanner temp = new Scanner(System.in);
   System.out.print("Please enter the full line of information for the book that you want to check out:"); //no longer applicable
   String bookChoice = temp.next().toLowerCase();
   String[] info = bookChoice.split(" "); //undefined length of [] info
//   in.isbn = isbn.parseLong(info[1]); 
//   in.book_name = info[3];
//   in.author = info[5];
//   in.category = info[7];
//   in.status = info[9]; <errors here, if you're trying to set info[x] to be equal to these fields, use info[x]= y
   if(in.status=="avalible"){ //if clashes with for 
     choices.add(bookChoice);
     Calendar calStudent = Calendar.getInstance();
     System.out.println("Check Out Date:"+ calStudent.getTime());
     int Student = 14;
     calStudent.add(Calendar.DATE,Student);
     System.out.println("Student due date is :"+calStudent.getTime());
     Library.lib.remove(in);
     
   for(int i = 0; i<2; i++){//this is the for that the above if clashes with: calStudent is carried over, not sure if intentional
     System.out.print("Please enter the ISBN#:");
     String isbnNumber = temp.next().toLowerCase();
     System.out.print("Please enter the book name:");
     String name = temp.next().toLowerCase();
     System.out.print("Please enter the author:");
     String authorPerson = temp.next().toLowerCase();
     System.out.print("Please enter the catogory:");
     String catogoryType = temp.next().toLowerCase();
     System.out.print("Please enter the status of the book:");
     String statusOfBook = temp.next().toLowerCase();
     Book in1 = new Book(isbnNumber, name, authorPerson, catogoryType, statusOfBook);
     if(statusOfBook.equals("avalible")){
       choices.add(name);
       calStudent = Calendar.getInstance();
       System.out.println("Check Out Date:"+ calStudent.getTime());
      // int Student = 14; //poorly chosen name for an int. Student is already a method that returns a String, as well as being the class name. This causes a compile error
       calStudent.add(Calendar.DATE,Student);
       System.out.println("Student due date is :"+calStudent.getTime());
       Library.lib.remove(in1);
     }
     else 
       System.out.print("Unfortunatly, book is unavailable. Please enter another book choice.");
     temp.close();
   } 
   //public ArrayList<String> books_has = new ArrayList<String>() use this to place the books that will be checked out
   //make the due dates from the book class
   //make sure the amount ckecked is legal for that respecive student
   
  // TODO Auto-generated method stub <-Nicky&Justin
  //cannot complete until borrower completed <-Nicky
   }
 } //you forgot to close checkOut method, inserted this to fix compile errors, not sure what you're trying to do here

 @Override
 void UI() {
  System.out.println("Successfully logged in");
   /*go to Catogory.getKey for book*/
  // TODO Auto-generated method stub <-Nicky
  //remember to only use scanner scnr, saves system resources and makes it better to close
  
 }
}