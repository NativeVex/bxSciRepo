import java.util.Scanner;
public abstract class Borrower{
  String x = "student";
  String y = "teacher";
  
  Scanner bob = new Scanner(System.in);
  System.out.println("Please enter if you are a teacher or a student");
  
  String sam = bob.nextString();
  
  if(sam.equals(x)){
    Student pokemon = new Book();
  }
  else if(sam.equals(y)){
    Teacher qiu = new Teacher();
  }
  else{
    System.out.println("You entered an invalid statement. Please reenter your occupation");
  }
  abstract void catalogueEnter();
  abstract void availabilityCheck();
  abstract void checkOut();
}