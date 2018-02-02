//Nicholas Bohay
//Assignment 7
/* File Client*/

public class FileClient {
    public static void main(String [] args)
    {
        File hello= new File();
        String hellonameoffile= hello.getname();
        System.out.println("File name is:"+hellonameoffile);
        
        
        File blah=new File("blah");
        System.out.println(blah);
        System.out.println(blah.toString());
        
        File noname=new File();
        noname.setname("Sport");
        System.out.println("\n noname:model is " + noname.getname());
        
        if (noname.equals(hello))
            System.out.println("\n noname and hello are equal");
        else    
            System.out.println("\n noname and hello are not equal ");
        
        hello.getlastletter("java.long");
        hello.getlastletter("java");
 
    }
}
