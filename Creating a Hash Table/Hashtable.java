import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileReader;

public class Hashtable {
	
static int MAX_SIZE=42;
static int MAX_COLUMN=5;
String[][] hashmap= new String[MAX_SIZE][5];
static Scanner scan=new Scanner(System.in);
static int countlinear;
static int countquad;
boolean found;
	class HashFunc{
				void Init(){//reads file from text to the 2d array
					try{
					    Scanner in=new Scanner(new FileReader("HashFile.txt"));
					    
					for (int i=0; i<MAX_SIZE;i++){
						String row=in.nextLine();
						String[] column=row.split(",");
						for (int j=0; j<MAX_COLUMN;j++){
							hashmap[i][j]=column[j];
						}
						
					}
					in.close();
				}catch(Exception e){}	
				}
				
				void addlinear(int key, String name, String major, String level, float gpa ){//adds to array with linear probing when called
					int newkey=key%MAX_SIZE;
				
					if((hashmap[newkey][0].contains("null")) && (hashmap[newkey][0]!=Integer.toString(key))){
						hashmap[newkey][0]=Integer.toString(key);
						hashmap[newkey][1]=name;
						hashmap[newkey][2]=major;
						hashmap[newkey][3]=level;
						hashmap[newkey][4]=Float.toString(gpa);	
					}
					
					else if((hashmap[newkey][0]!=null) || (hashmap[newkey][0]!=Integer.toString(key))){
							newkey=(newkey+1)%MAX_SIZE; 	//linear probing
							hashmap[newkey][0]=Integer.toString(key);
							hashmap[newkey][1]=name;
							hashmap[newkey][2]=major;
							hashmap[newkey][3]=level;
							hashmap[newkey][4]=Float.toString(gpa);
							countlinear++;
				}}
					
				void addquad(int key, String name, String major, String level, float gpa ){//adds with quadratic probing when called
					int newkey=key%MAX_SIZE;
				
					if((hashmap[newkey][0].contains("null")) && (hashmap[newkey][0]!=Integer.toString(key))){
						hashmap[newkey][0]=Integer.toString(key);
						hashmap[newkey][1]=name;
						hashmap[newkey][2]=major;
						hashmap[newkey][3]=level;
						hashmap[newkey][4]=Float.toString(gpa);	
						
					}
					
					else if((hashmap[newkey][0]!=null) || (hashmap[newkey][0]!=Integer.toString(key))){
							for(int j=0; j<MAX_SIZE; j++){//quadratic probing
								newkey=(newkey+j*j)%MAX_SIZE;
							}
							hashmap[newkey][0]=Integer.toString(key);
							hashmap[newkey][1]=name;
							hashmap[newkey][2]=major;
							hashmap[newkey][3]=level;
							hashmap[newkey][4]=Float.toString(gpa);
							countquad++;
				}}
				
				void writetofile(String filename){//adds the contents of the 2d array to the text file
					try{
					
						PrintWriter pw=new PrintWriter(new FileWriter(filename));
					
					for (int i=0; i<hashmap.length;i++){
						for (int k=0; k <hashmap[i].length; k++){
							pw.write(hashmap[i][k]+",");
						}
						pw.write("\r\n");
						
					}
					pw.flush();
					pw.close();
					}
					catch(Exception e){}
				}
				
				void check(String id){//checks if the id is in the 2d array 
					int i;
					for (i=0; i<MAX_SIZE; i++){
						for (int coli=0;coli<5; coli++){
								if(id.equals(hashmap[i][coli])){
									printArray(hashmap,i);						
								}
						}}
										
				}
				
				void printArray(String[][] array, int row){//prints contents of id listings
					System.out.println("ID: "+hashmap[row][0]+" Name: "+hashmap[row][1]+" Major: "+hashmap[row][2]
								+" Level: "+hashmap[row][3]+" GPA: "+hashmap[row][4]);
				}
					
	
				void printTable(){//prints entire contents of hashtable
					for (int i=0; i<42; i++){
							for (int j=0; j<5; j++){
								System.out.print(hashmap[i][j] + " ");
							}
							System.out.println();
					}
				}
			
	}
	
	
	public static void main(String[] args) {
			Hashtable hash=new Hashtable();//initializes hashtable
			Hashtable.HashFunc st= hash.new HashFunc();
			st.Init();//copies contents from text to 2d array
			char ans;
			do{
				//asks the user what they want to do
				System.out.println("Press 1 to ADD linearly or");
				System.out.println("press 2 to ADD quadratically ");
				System.out.println("press 3 to Search");
				System.out.println("press 4 to print table");
				System.out.println("press 5 for stats:");
				int choice=scan.nextInt();
			
			switch(choice){//depending on choice do the case
			case 1:
				System.out.println("ID number: \n");
				int id=scan.nextInt();
				System.out.println("Name: \n");
				String name=scan.next();
				System.out.println("Major: \n");
				String major=scan.next();
				System.out.println("Classification Status: \n");
				String classstatus=scan.next();
				System.out.println("GPA: \n");
				float gpa=scan.nextFloat();
				st.addlinear(id,name,major,classstatus,gpa);
				break;
			case 2:
				System.out.println("ID number: \n");
				int id2=scan.nextInt();
				System.out.println("Name: \n");
				String name2=scan.next();
				System.out.println("Major: \n");
				String major2=scan.next();
				System.out.println("Classification Status: \n");
				String classstatus2=scan.next();
				System.out.println("GPA: \n");
				float gpa2=scan.nextFloat();
				st.addquad(id2,name2,major2,classstatus2,gpa2);
				break;
			case 3:
				System.out.println("What is the ID number?");
				String findid=scan.next();
				st.check(findid);
				break;
			case 4:
				st.printTable();;
				break;
			case 5:
				System.out.println("Times linear probing: "+ countlinear +" Times Quadratic Probing: "+countquad);
				break;
			default:
				System.out.println("You have typed an incorrect number!");
				break;
			}
			
			System.out.println("Do you want to continue (y or n)?");
			ans = scan.next().charAt(0);
			//if the user is done calls upon write to file and writes the 2d array to the text
			if (ans=='n'|| ans=='N'){
				st.writetofile("Hashfile.txt");
			}
			
			
			} //if user wants to continue loop starts again
			while(ans == 'y'|| ans=='Y');
	
	}

}
