import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Calendar;
import java.util.ArrayList;
//got to incorperate id (this is where teacher txt file comes in)
//got to add a category shower
//got to add a availability shower 
//got to add a availibility swapper 

public class Teacher extends Borrower {
  public void checkout(){
  ArrayList<String> lib = new ArrayList<String>();
      int i = 0; 
      Scanner temp=new Scanner(System.in);
      while(i<4){
        System.out.print("Please enter the ISBN#:");
        String isbn = temp.next().toLowerCase();
        System.out.print("Please enter the book name:");
        String book_name = temp.next().toLowerCase();
        System.out.print("Please enter the author:");
        String author = temp.next().toLowerCase();
        System.out.print("Please enter the catogory:");
        String category = temp.next().toLowerCase();
        System.out.print("Please enter the status of the book:");
        String status = temp.next().toLowerCase();
        System.out.println("system updated");
        String result = "ISBN#= "+isbn+" BookName= "+book_name+" Author= "+author+" Category= "+category+" Status= "+status+"\n";
        lib.add(result);
          i++;       
      }
      String filename="TeacherCheckOuts.txt";
      try {
        PrintWriter output = new PrintWriter(filename);
        output.print(lib);
        Calendar calStudent = Calendar.getInstance();
      System.out.println();
      System.out.println("Check Out Date for both books are: \n"+ calStudent.getTime());
      int Student = 7;
      calStudent.add(Calendar.DATE,Student);
      System.out.println("Student due date is :"+calStudent.getTime());
      output.close();
      }
      catch(FileNotFoundException e){
        e.printStackTrace();
    }
        temp.close();
  }
}