//Nicholas Bohay
//Algorithms
//Homework #3
//Airport Simulation


import java.util.*;
import java.text.DecimalFormat;
public class Airport {
	
	static String newLine = System.getProperty("line.separator");
	
	public static void main(String[] args){
				
		int time= 120;
		int i;
		long min=00;
		DecimalFormat format=new DecimalFormat("00");
		int hr=12;
		int land=0;
		int air=0;
		int planesmissed=0;
		
		//array of companies for flights
		String[] company;
		company=new String[3];
		company[0]="American Airlines";
		company[1]="Delta";
		company[2]="United";
		
		//sets up take off queues and in air queue
		Queue<Integer> planestakeoff=new LinkedList<Integer>();
		Queue<Integer> planesinair = new LinkedList<Integer>();
		int max=7;//will determine max queue size
		
		//initializes runways as clear
		boolean open=true ;
		boolean closed=false;
		Boolean runway1=open;
		Boolean runway2=open;
		
		for (i=0;i<=time;i+=5){
			Random num=new Random();
			int num2=Math.abs(num.nextInt(3)+0);//creates random number from 0-3 used for creating planes
			Random num1=new Random();
			int num3=Math.abs(num1.nextInt(3)+0);//creates random number from 0-3 used for getting company info;
				
				
					//sets up time in minutes
					if(min>=60){
						hr=hr+1;
						min=min-60;	
						}
					 //minutes start at :00
					
					System.out.println(newLine+"The time is " +hr+":"+format.format(min)+" P.M."+newLine);	//prints the start time
					min+=5;
					
					int sizeinit=planestakeoff.size();
					int sizeairinit=planesinair.size();
					
					System.out.println("There are "+sizeinit+" in the takeoff queue.");
					System.out.println("There are "+sizeairinit+" in the planes in air queue.");
					
					for(int p=0;p<num2;p++){
						Random rn =new Random();//creates a random plane from 1 to 1000
						int random=rn.nextInt((1000)+1);
						
						if (sizeinit<max && (random %2 ==0)){//even
							planestakeoff.add(Math.abs(random));
							}
						else if (sizeairinit<max &&(random%2!=0)){//odd
							planesinair.add(Math.abs(random));
							}
						else{
							planesmissed+=1;
						}
					}
					int size=planestakeoff.size();
					int sizeair=planesinair.size();
					
					System.out.println("Planes in the initial takeoff queue..." + planestakeoff);    //prints items in takeoff queue
					System.out.println("Planes in the initial in-air queue..." + planesinair); //prints items in air queue
					
					
					if ((sizeair!=0||size!=0) && (runway1==open||runway2==open)){//checks to see if runways are open adds priority to planes in air
						if (sizeair!=0){
							System.out.println(company[num3] +" flight: "+planesinair.element()+" is cleared for landing");
							planesinair.remove();
							air+=1;
							runway1=closed;
						}
						else if(sizeair!=0){
							System.out.println(company[num3] +" flight: "+planesinair.element()+" is cleared for landing");
							planesinair.remove();
							air+=1;
							runway2=closed;
						}
						else if(runway1=open){
							System.out.println(company[num3] +" flight: "+planestakeoff.element()+" is cleared for takeoff");
							planestakeoff.remove();
							land+=1;
							runway1=closed;	
						}
						else if(runway2=open){
							System.out.println(company[num3] +" flight: "+planestakeoff.element()+" is cleared for takeoff");
							planestakeoff.remove();
							land+=1;
							runway2=closed;
						}
					}
					int finalground=planestakeoff.size();
					int finalair=planesinair.size();
					System.out.println("Planes in the new takeoff queue..." + planestakeoff);    
					System.out.println("Planes in the new in-air queue..." + planesinair);
					System.out.println("There are now "+finalground+" in the takeoff queue.");//prints number in new takeoff queue
					System.out.println("There are now "+finalair+" in the planes in air queue.");//prints number in new air queue
				}
				
	
	System.out.println(newLine+"The time is: " +hr+":"+format.format(min)+" P.M"+newLine);
	System.out.println("planes taken off "+land); //prints the number of planes that have taken off during simulation
	System.out.println("planes landed "+air);	  //prints the number of planes that have landed during simulation
	System.out.println("Average landing wait time "+time/air+ " minutes"); //calculates average wait time in the air
	System.out.println("Average take off time "+time/land+ " minutes"); //calculates average wait time for take off
	System.out.println("Planes diverted to different airport "+planesmissed);
	
	}
}