<<<<<<< HEAD
//tried my best...By Justin :)
//alright, so this code should be able to identify what the user is asking for
import java.util.Scanner;
public class Category {
  ArrayList<String>fullList= new ArrayList<String>();
  Scanner bob = new Scanner();
  System.out.println("Please enter an ISBN number, bookname, catagory, or keywordfor the book(s) that you would like:");
  String pokemon = bob.next().toLowerCase();//alright so we are going to make everythin lower case so that java dosent give us any errors. 
  String gundam = "Books.txt";
  ArrayList<String> catalogue = fetch(gundam);
  for(int i=0; i < catalogue.size(); i++){
    String line = catalogue.get(i);
    String[] s1 = line.split(" ");
    for(String s : s1){
        if(pokemon.equals(s)){
          fullList.add(line);
        }
        else
          break;//is this the correct way?
    }
  }
  return fullList;
}
=======
//tried my best...By Justin :)
//alright, so this code should be able to identify what the user is asking for
import java.util.Scanner;
public class Category {
  ArrayList<String>fullList= new ArrayList<String>();
  Scanner bob = new Scanner();
  System.out.println("Please enter an ISBN number, bookname, catagory, or keywordfor the book(s) that you would like:");
  String pokemon = bob.next().toLowerCase();
  String gundam = "Books.txt";
  ArrayList<String> catalogue = fetch(gundam);
  for(int i=0; i < catalogue.size(); i++){
    String line = catalogue.get(i);
    String[] s1 = line.split(" ");
    for(String s : s1){
        if(pokemon.equals(s)){
          fullList.add(line);
        }
        else
          break;//is this the correct way?
    }
  }
  return fullList;
}
>>>>>>> origin/feb3-22-project
  