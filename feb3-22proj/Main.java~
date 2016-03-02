import java.util.ArrayList;
import java.util.Scanner;

public class Main {

 public static ArrayList<Library> list = new ArrayList<Library>();
 public static void main(String[] args) {
  Scanner temp = new Scanner(System.in);
  System.out.println("would you like to create a new library or use an existing one?%n New: 'n', Existing, 'e'");
  if(temp.next().toLowerCase().equals("n")){
   list.add(new Library(temp.next()));
  }else if(temp.next().toLowerCase().equals("e")){
   System.out.println(list +"%n%nplease choose a library");
   String name = temp.next();
   boolean successful_launch = false;
   for(Library lib: list){
    if(lib.toString().equals(name)){
     successful_launch = true;
     Library.launch(false);
    }
   }
   if(successful_launch ==false){
    System.out.println("no such library found. Quitting.");
    System.exit(2);
   }
  }else{
   System.out.println("input not recognized. Quitting.");
   System.exit(1);
  }
  temp.close();
 }

}