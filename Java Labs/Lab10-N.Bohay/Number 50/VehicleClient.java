/*Nicholas Bohay
 */
public class VehicleClient {
    public static void main(String [] args){
    MotorizedVehicle a= new MotorizedVehicle(10,4);
    int np = a.gethorsepower(10,4);
    System.out.println(np);
   
    bicycle b= new bicycle(2);
    
    int d = b.isbicycle(4);
    System.out.println(d);
    
    
    }
}
