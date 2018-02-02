//Nicholas Bohay
//Number 52 Assignment 6
import java.util.Scanner;
import java.util.Arrays;

public class MinimumVal {
     public static void main(String [] args)
{   
    Scanner scan= new Scanner(System.in);
  
    int[] nums = new int[10];
    for(int i = 0; i < 10; i++){ 
        
        System.out.print("\n Enter a number >");
        nums[i] = scan.nextInt();
        
          }
    Arrays.sort(nums);
    
   System.out.println(nums[0]);
    
    
}
}