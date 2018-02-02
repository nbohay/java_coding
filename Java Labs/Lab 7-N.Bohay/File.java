//Nicholas Bohay
//Assignment 7
/* FILE CLASS */
public class File {
    String nameoffile;

//Default Constructor
public File(){
nameoffile="unknown";
}

//Overloaded Constructor
public File(String startname){
nameoffile=startname;
}

//Accessor
public String getname(){
return nameoffile;
}

//Mutator
public void setname(String newName){
nameoffile=newName;
}

//toString
public String toString(){
   return "The name of the file is: "+ nameoffile;
}

//Equals
public boolean equals(Object o){
    if (!(o instanceof File))
        return false;
    else{
        File objFile= (File) o;
        if (nameoffile.equals(objFile.nameoffile))
              return true;
        else 
            return false;
    }
}


//Extension of file
public void getlastletter(String lastletters)
{
    if(lastletters.contains(".")){
        int dot = lastletters.indexOf('.');
        String last= lastletters.substring(dot+1);
        System.out.println(last);
            }

    else{
        System.err.print("unknown file extension");
}
    
}


}