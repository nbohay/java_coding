//Nicholas Bohay
//Number 44 Assignment 6
import java.util.Scanner;
public class Theatsign {
     public static void main(String [] args)
{   
    Scanner scan= new Scanner(System.in);
  
    
    System.out.print("Enter a word with the @ sign>");
    String word =scan.nextLine() ;
    
    while (word.indexOf("@")==-1){
        
        System.out.print("\n Enter another word>");
        word =scan.nextLine();
        }
    
    if (word.indexOf("@")>=1){
        System.out.print(word);
}
    
    
}
}