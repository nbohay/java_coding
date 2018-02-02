/*Nicholas Bohay
Assignment 10
 */
public abstract class Vehicle {
    public String ownersname;
    public int numberofwheels;
    
    public Vehicle(){
        
    }
    public Vehicle(int startnumberofwheels, String startownersname){
        numberofwheels=startnumberofwheels;
        ownersname=startownersname;             
    }
    public int getnumberofwheels(){
        return numberofwheels;
    }
    public String getName(){
        return ownersname;
    }
    public void setnumberofwheels(int number){
        numberofwheels=number;
    }
    public void setownersname(String name){
        ownersname=name;
    }
}