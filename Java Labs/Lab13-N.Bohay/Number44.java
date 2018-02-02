/*Nicholas Bohay
Assigment 13
 */
import java.util.Scanner;

public class Number44 {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number to divide by 3> ");
        double value= scan.nextInt();                
        double p= fact(value,3);
        System.out.println(p);
    }
    public static double fact(double n, double divisor){
        double i= 1.0;
       
        if (n >=i)
            return (fact(divisor, (n / divisor)));
        else
            return n;
        
           
        
       
    }
}
