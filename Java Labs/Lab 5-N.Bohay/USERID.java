//Nicholas Bohay
//Assignment 5

import java.util.Scanner;

public class USERID {
    public static void main (String [] args){
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter a USER ID:");
        String id = scan.next();
        int inp= id.length();
        if (inp > 6 && inp < 10){
            System.out.println("Welcome "+ id);
        }
        else{
            System.out.println("Sorry User ID invalid");
        }
        
        
        
    }
    }