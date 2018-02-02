/*Nicholas Bohay
Assignment 10
 */
public class Circle {
    public double radius;
    
    public Circle(){
       
    }
    
    public Circle(double startradius){
        radius=startradius;
    }
    
       
    public double getradius(){
        return radius;
    }
    
    public double getperimeter(double radius){
        double perimeter=2*Math.PI*radius;
        
        return perimeter;
    }
     public double getarea(double radius){
        double area=Math.PI*(radius*radius);
        
        return area;
    }
  
    
}
