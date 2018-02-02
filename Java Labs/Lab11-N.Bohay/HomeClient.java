/*Nicholas Bohay
Assignment 11
 */
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.EOFException;
public class HomeClient {
    public static void main(String args []){
        Home h1=new Home(12,200,false);
        Home h2=new Home(1,50,true);
        Home h3=new Home(30,6,true);
        Home h4=new Home(20,500,false);
        Home h5=new Home(100,15000,false);
  
    try{
        FileOutputStream fos= new FileOutputStream("objects",false);
        
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        
        
        oos.writeObject(h1);
        oos.writeObject(h2);
        oos.writeObject(h3);
        oos.writeObject(h4);
        oos.writeObject(h5);
        
        oos.close();
        
        
    }
    catch (FileNotFoundException fnfe){
        System.out.println("Unable to write to Objects");
    }
    catch (IOException ioe)
    {
        ioe.printStackTrace();
    }
    
    try{
        FileInputStream fis=new FileInputStream("objects");
        ObjectInputStream ois=new ObjectInputStream(fis);
        try{
            while (true){
                Home temp=(Home) ois.readObject();
                System.out.println(temp);
            }
        }
    catch(EOFException eofe){
        System.out.println("End of the file reached");
    }
    catch(ClassNotFoundException cnfe){
        System.out.println(cnfe.getMessage());
    }
    finally {
        System.out.println("Closing File");
        ois.close();
    }}
    catch(FileNotFoundException fnfe){
        System.out.println("Unable to find objects");
    }
    catch(IOException ioe){
        ioe.printStackTrace();
    }
    
    
    }
}
