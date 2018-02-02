/*Nicholas Bohay
Assignment 10
 */
public class MotorizedVehicle {
    public int enginevolume;
    public int horsepower;
    
    public MotorizedVehicle(int enginevolume, int newwheels){
       setenginevolume(enginevolume);
       int numberofwheels=newwheels;
    }
    public int gethorsepower(int enginevolume, int numberofwheels){
        horsepower= enginevolume*numberofwheels;
        return horsepower;
                
    }
    public void setenginevolume(int number){
        enginevolume=number;
    }
    
    
}
