// Nicholas Bohay   
//Assignment 3 

import java.util.Scanner;
public class Smaller
{
public static void main(String [] args)
{ 
    Scanner scan= new Scanner(System.in);
    System.out.print("Enter a word:");
    String a = scan.next();
    System.out.print("Enter another word:");
    String b= scan.next();
    
    int lena = a.length();
    int lenb = b.length();
    
    int smaller= Math.min(lena,lenb);
    System.out.print("the smaller of "+a+ " and "+b+ " is " +smaller);
}}