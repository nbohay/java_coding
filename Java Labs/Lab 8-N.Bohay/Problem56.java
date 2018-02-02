/*Nicholas Bohay
Assignment 8
 */
import java.text.DecimalFormat;

public class Problem56 {
    public Problem56(boolean [] c, int size){
        int index=0;
        double percent= (size-index)/size;
        percent=percent*100;
        DecimalFormat Newpercent =new DecimalFormat("%0.0");
        for (int i=0; i<c.length; i++){
            if (c[i]== true)
                i++;
            else
               index++;
            
        }
        
        System.out.println(Newpercent.format(percent));
    }
    
}
