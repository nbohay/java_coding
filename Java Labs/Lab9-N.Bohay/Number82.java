/*Nicholas Bohay
Assignment 9
 */
public class Number82 {
    int [][] array;

public Number82(int [] [] newarray){
    array=newarray;
}

public char[][] tolettergrade(int [][] a){
char [][] lettergrade = new char[2][];

for (int i=0; i< a.length; i++){
 for (int j=0; j < a[i].length; j++){
     
    if (a[i][j] >=80)
    lettergrade[i][j]='A';
    else if (a[i][j] >=80)
    lettergrade[i][j] = 'B';
    else if (a[i][j] >=70)
    lettergrade[i][j] = 'C';
    else if (a[i][j] >= 60)
    lettergrade[i][j] = 'D';
    else lettergrade[i][j] ='F';
 }}
    return lettergrade;	 
}
}





