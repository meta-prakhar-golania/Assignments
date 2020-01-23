import java.util.Scanner;
import java.lang.Math;


/*Program to implement FCFS(first come first serve)
 * @author Prakhar Golania
 * */

public class JobScheduler 
	{
	
	/*For calculation of compile time
	 * @param cT[] is use for compile time array
	 * @param rP[][] is use to get recieveProcess array
	 * @param n is use for  no. of processes
	 * */
	public void compTime(int cT[],int rP[][],int n)
		{
		for(int i=0;i<n;i++)
		if(i==0)
			cT[i]=rP[i][0]+rP[i][1];
		else
			if(rP[i][0]<cT[i-1])
				cT[i]=cT[i-1]+rP[i][1];
			else
				cT[i]=rP[i][0]+rP[i][1];
		}
	
	/*For calculation of turn around time
	 * @param cT[] is use for compile time array
	 * @param rP[][] is use to get recieveProcess array
	 * @param taT[] is use to get turnAroundTime array
	 * @param n is use for  no. of processes
	 * */
	public void turnAround(int cT[],int rP[][],int tAT[],int n)
		{
		for(int i=0; i<n;i++)
			{
			tAT[i]=Math.abs(rP[i][0]-cT[i]);
			}
		}
	
	/*For calculation of waiting time
	 * @param wT[] is use to get waitingTime array
	 * @param rP[][] is use to get recieveProcess array
	 * @param taT[] is use to get turnAroundTime array
	 * @param n is use for  no. of processes
	 * */ 
	public void waitTime(int tAT[],int rP[][],int wT[], int n)
		{
		for(int i=0; i<n;i++)
			{
			wT[i]=Math.abs(tAT[i]-rP[i][1]);
			}
		}
	
	
	public static void main(String[] args)
		{
		JobScheduler j= new JobScheduler();
		Scanner input = new Scanner(System.in);
		int recieveProcess[][]=new int[100][2],i=0;  //recieveProcess[][] use to recieve process details 
		char choice;
		for(;;)
			{
			while(true){
			try{
				System.out.println("Enter the Arrival time:");
				recieveProcess[i][0]=input.nextInt();
				System.out.println("Enter the burst time:");
				recieveProcess[i][1]=input.nextInt();
				break;
			}catch(Exception ex){
				System.out.println("\n\nEnter the valid time\n\n");
				input.nextLine();
			}
			}
			System.out.println("Do you want to enter more\nPress y for YES and any key for NO:");
			choice=input.next().charAt(0);
			i++;
			if(choice=='y')
				continue;
			else
				break;
			}
		int numberOfProcess=i; //To get No. of process(input)
		int avgWaitingTime=0,maxWaitingTime=0;
		i=0;
		int completionTime[]=new int[10],turnAroundTime[]=new int[10],waitingTime[]=new int[10];
		j.compTime(completionTime,recieveProcess,numberOfProcess);
		j.turnAround(completionTime,recieveProcess,turnAroundTime,numberOfProcess);
		j.waitTime(turnAroundTime,recieveProcess,waitingTime,numberOfProcess);
		System.out.println("S.No.\t\tCompletion Time\t\tTurn Around Time\t\tWaiting Time");
		
		/*Process to calculate average waiting time and max waiting time
		 * */
		for(i=0;i<numberOfProcess;i++)
			{
			System.out.println(i+1+"\t\t\t"+completionTime[i]+"\t\t\t"+turnAroundTime[i]+"\t\t\t\t"+waitingTime[i]);
			avgWaitingTime=avgWaitingTime+waitingTime[i];
			if(maxWaitingTime<waitingTime[i])
				maxWaitingTime=waitingTime[i];
			}
		System.out.println("\nAverage Waiting Time of whole process is "+avgWaitingTime/numberOfProcess);
		System.out.println("\nMaximum waiting Time of Process is "+maxWaitingTime);
		input.close();
			
		
		}
	}
