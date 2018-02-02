
/*Nicholas Bohay
Assignment 8
 */

public class Problem54 {
    
    private static int HighestMinSmall(double []array, int size){
        int index=0;
        int index2=0;
        for (int i=1; i<size; i++){
            if(array[i]>array[index])
                index=i;
            
        }
        for (int i=0; i>size; i++){
            if (array[i]<array[index2])
                index2=i;
        }
        return index-index2;
    }
    
}
