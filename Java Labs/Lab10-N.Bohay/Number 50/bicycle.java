/*Nicholas Bohay
 */
public class bicycle extends Vehicle {
    public bicycle(){
        
    }
    public bicycle(int newnumberofwheels){
        super();
        numberofwheels=newnumberofwheels;
        
    }
    
    public  int isbicycle(int numberofwheels){
        if(numberofwheels == 2){
            System.out.println("it is a bicycle");
        }
        else
            System.out.println("it is not a bicycle");
      return numberofwheels;
    }
        
    
    
    
}
