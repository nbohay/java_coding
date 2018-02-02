//Nicholas Bohay
//Assignment 3

import java.util.Random;

public class RandomInt {
      public static void main(String [] args)
{ 
    Random random= new Random();
    int start= 0, end = 50;
    double r1= random.nextInt(end-start+1)+start;
    double r2 = random.nextInt(end-start +1)+start;
    double r3 = random.nextInt(end-start +1)+start;
    
    double average= (r1+r2+r3)/3;
    System.out.println(average);
    
}
}

