/*Nicholas Bohay
 */
public class BoardGame extends Game {
    public int numberofplayers;
    public String tieornot;

    public BoardGame(String description){
        super(description);
        System.out.println(description);
    }
    public BoardGame( int numberofplayers, String tieornot, String description){
        super(description);
        setnumberofplayers(numberofplayers);
        settieornot(tieornot);
    }
    public int getnumberofplayers(){
        return
                numberofplayers;
    }
    
    public void setnumberofplayers(int newnumberofplayers){
    numberofplayers=newnumberofplayers;
    }
    
    public String toString(){
        return ("numberofplayers: "+numberofplayers+ " \ntieornot: "+tieornot);
    }
    public String gettieornot(){
        return tieornot;
    }
    public void settieornot(String newtieornot){
        if(newtieornot == "no"){
            tieornot="no";
        }
        else{
        tieornot="yes";
        }
    }
   
}
