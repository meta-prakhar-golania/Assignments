package priorityQueue;

/*@author Prakhar Golania
 * Class to perform priority queue operation 
 * */
public class PriorityQueue {
	
	static Queue priQueue[] = new Queue[5];
	static int front=-1,rear=-1;
	
	/*function to add process in queue
	 * @param process,priority 
	 * */
	public void addProcess(String process, int priority){
		Queue newProcess = new Queue(process,priority);
		if(front==-1){
			front++;
			rear++;
			priQueue[rear]=newProcess;
		}
		else if(rear==4 && front!=0){
			rear=0;
			priQueue[rear]=newProcess;
		}
		else{
			rear++;
			priQueue[rear]=newProcess;
		}
		priorityQueue();	
	}
	
	/*function to arrange process priority wise
	 * */
	public static void priorityQueue(){
		for(int i=front;i<=rear;i++){
			for(int j=front+1;j<=rear;j++)
				if(priQueue[j-1].priority < priQueue[j].priority){
					Queue temp;
					temp=priQueue[j-1];
					priQueue[j-1] = priQueue[j];
					priQueue[j] = temp;
				}
		}
	}
	
	/*function to delete process
	 * */
	public void deleteProcess(){
		for(int i=front;i<=rear-1;i++){
			priQueue[i]=priQueue[i+1];
		}
		rear--;
	}
	
	/*function to display priority queue
	 * */
	public void displayPriorityQueue(){
		for(int i=front;i<=rear;i++){
			System.out.println(priQueue[i].process);
			}
		System.out.println("\n\n");
		}
		
	
	public static void main(String[] args){
		PriorityQueue obj = new PriorityQueue();
		obj.addProcess("1st process",9);
		obj.addProcess("2nd process",5);
		obj.addProcess("3rd process",1);
		obj.addProcess("4th process",7);
		obj.addProcess("5th process",2);
		obj.displayPriorityQueue();
		obj.deleteProcess();
		obj.displayPriorityQueue();
		obj.deleteProcess();
		obj.displayPriorityQueue();
		obj.addProcess("6th process",10);
		obj.addProcess("7th process",4);
		obj.displayPriorityQueue();
	}
}
