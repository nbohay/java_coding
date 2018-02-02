/*Nicholas Bohay
Assignment 10
 */
public class CirclecylinderClient {
   public static void main (String [] args){
        Circle a= new Circle(23);
        double no= a.getperimeter(13);
        double yes=a.getarea(no);
        System.out.println(no);
        System.out.println(yes);
        
        Cylinder b = new Cylinder();
        double hello1 =b.getvolume(10,5);
        double hello =b.getarea(10,5);
        System.out.println(hello);
        System.out.println(hello1);
}}
