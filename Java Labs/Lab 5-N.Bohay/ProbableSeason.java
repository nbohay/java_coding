//Nicholas Bohay
//Assignment 5
import java.util.Scanner;

public class ProbableSeason {
    public static void main (String [] args){
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter a temperature:");
        double temp = scan.nextInt();
        
        if (temp> 110 || temp< -5 ){
            System.out.println("Outside valid range"); }
        
        else{
            if (temp >=90){
                System.out.println("It is probably summer");}
                else if (temp>=70 && temp <90){
                System.out.println("It is probably spring");}
                else if (temp>=50 && temp <70){
                System.out.println("It is probably fall");}
                else if (temp<50){
                System.out.println("It is probably winter");}
        }
           
        
    }
    }