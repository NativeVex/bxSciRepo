//By Justin :)
//alright, so this code should be able to identify what the user is asking for
import java.util.Scanner;
import java.util.ArrayList;
public class Category {
  public static ArrayList<String> getKey(){
    ArrayList<String>fullList= new ArrayList<String>();
    @SuppressWarnings("resource")
	Scanner bob = new Scanner(System.in);
    System.out.println("Please enter an ISBN number, bookname, catagory, or keyword for the book(s) that you would like:");
    String pokemon = bob.next().toLowerCase();//alright so we are going to make everythin lower case so that java dosent give us any errors. 
   // String gundam = "Books.txt";
    //ArrayList<String> catalogue = Library.fetch(gundam);
    for(int i=0; i < Library.lib.size(); i++){
      //Book line = new Book(isbn, book_name, author, category, status);
      Book line = Library.lib.get(i);
      String theBook = line.toString();
      String[] s1 = theBook.split(" ");
      for(String s : s1){
        if(pokemon.equals(s)){
          fullList.add(theBook);
        }
        else
          break;//is this the correct way?
    }
  }
  return fullList; 
}
}

  