/*Nicholas Bohay
Assignment 9
*/
public class Number82Client {
    public static void main(String [] args ){
        int [] [] a = {{10,20,30,4},
                        {20,30,70,90}};
        
        Number82 alpha= new Number82 (a);
        int [][] b= alpha.tolettergrade();
        System.out.println(b);
              
        
        
        
        
    }
            
}
