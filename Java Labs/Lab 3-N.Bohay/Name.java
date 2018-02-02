// Nicholas Bohay
//Assignment 3

import java.util.Scanner;
public class Name {
    public static void main(String [] args)
{ 
    Scanner scan= new Scanner(System.in);
    System.out.print("Enter your First and Last name:");
    String name = scan.nextLine();
    
    int space = name.indexOf(' ');
    String Fname= name.substring(0, space);
    
    System.out.print("Hello "+ Fname);
}
}
