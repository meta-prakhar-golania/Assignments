package priorityQueue;

/*@author Prakhar Golania
 * interface of Queue
 * */
public class Queue {
	int priority;
	String process;
	
	Queue(String process,int priority){
		this.priority = priority;
		this.process = process;
	}
	
	public int getPriority(){
		return this.priority;
	}
	
	public String getProcess(){
		return this.getProcess();
	}
}
