//Nicholas Bohay
//Assignment 5

import java.util.Scanner;

public class BattingAVG {
    public static void main (String [] args){
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter number of hits:");
        double hits = scan.nextInt();
        System.out.print("Enter number of bats:");
        double bats = scan.nextInt();    

        double avg= (hits/bats);
               
        double needed = 0.300;
        
        if (avg > needed){
          System.out.println("Eligible for all stars game");}
        
        else 
            System.out.println("Not eligible for all stars game");
          
          
        
       
    
    }
}