/*Nicholas Bohay
Assignment 10
 */
public class Cylinder extends Circle{
    public double length;
    
    public Cylinder(){
        
    }
    public Cylinder(double newlength){
        length=newlength;
    }    
    public double getlength(){
        return length;
    }
    public double getvolume(double radius,double length){
        double volume= length*Math.PI;
        return volume;
    }
    public double getarea(double radius, double length){
        double area=(2*Math.PI*radius)+(2*Math.PI*(radius*radius));
        return area;
    }
}