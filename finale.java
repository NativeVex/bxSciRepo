import java.util.Scanner;

public class finale{
  public static void main (String [] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Who are you, Borrower (1) or Libarian (2)");
    int person = input.nextInt();
    if (person == 1){
      System.out.println("you are borrowing");
      System.out.println("are you a teacher(1) or student(2)");  
      int borrower = input.nextInt();
      if (borrower ==1){
//-------------------need to checks to see id matches with txt file of student ***
        System.out.println("you are a Teacher ");
//-------------------needs to calls teacher method catelog checker 
//-------------------needs to call teacher method of avalibility checker 
//-------------------need to call on teacher method check out 
      }
      else if (borrower == 2){
//-------------------need to checks to see id matches with txt file of teacher ***
        System.out.println("you are a Student  ");
//-------------------needs to calls student method catelog checker 
//-------------------needs to call student method of avalibility checker 
//-------------------need to call on student method check out 
      }
      else{
        System.out.println("Enter a 1 or 2 (not that hard...)");
      }
    }
    else if (person == 2){
      System.out.println("you are a libarian ");
      System.out.println("Are you Adding(1), Removing(2), or Checking(3) a book");
      int libarianJob  = input.nextInt();
        if (libarianJob == 1){
          System.out.println("you are Adding");
//------------------libarianJob.add();
        }
        else if (libarianJob == 2){
          System.out.println("you are removing");
//------------------libarianJob.remove();
        }
        else if (libarianJob == 3){
          System.out.println("you are checking");
//------------------libarianJob.check();
        }
        else {
          System.out.println("Enter a 1 or 2 (not that hard...)");
        }
    }
    input.close(); 
  }
}

