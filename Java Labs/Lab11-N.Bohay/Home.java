/*Nicholas Bohay
Assignment 11
 */
import java.io.Serializable;
public class Home implements Serializable {
    private int numberofrms;
    private int sqrfootage;
    private boolean basement; 
    public Home(int startnumberofrms, int startsqrfootage, boolean startbasement){
        numberofrms= startnumberofrms;
        sqrfootage=startsqrfootage;
        basement=startbasement;
      }
    public String toString(){
        return("Number of rooms= "+numberofrms+"\nSquare Footage: "+sqrfootage+
                "\nHas a basement: "+basement);
        
    }
            
}
