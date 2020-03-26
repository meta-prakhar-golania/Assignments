package Queue;

/*@author Prakhar Golania
 * Class to perform different queue operation
 * */
import java.util.Scanner;

public class QueueOperation implements Queue{
	
	static int front=-1,rear=-1,queue[]=new int[5],size=5;
	
	@Override
	/*function to add element in queue
	 * */
	public void addElement(int data){
		if(front==-1){
			front++;
			rear++;
			queue[rear]=data;
		}
		else if(rear==size-1 && front!=0){
			rear=0;
			queue[rear]=data;
		}
		else{
			rear++;
			queue[rear]=data;
		}
	}
	
	@Override
	/*function to delete element in queue
	 * */
	public void deleteElement(){
		if(front==rear){
			front=-1;
			rear=-1;
		}
		else if(front==size){
			front=0;
		}	
		else{
			front++;
		}
	}
	
	@Override
	/*function to check whether queue is full or not
	 * */
	public boolean isFull(){
		if((rear==front-1)||(front==0 && rear==size-1)){
			return true;
		}
		else 
			return false;
	}
	
	@Override
	/*function to check whether queue is empty or not
	 * */
	public boolean isEmpty(){
		if(front==-1)
			return true;
		return false;
	}
	
	/*function to display element of queue
	 * */
	public void display(){
		if(front==-1)
			System.out.println("Queue is empty");
		else if(rear<front){
			for(int i=front;i<size;i++)
				System.out.print(queue[i]+"  ");
			for(int i=0;i<=rear;i++)
				System.out.print(queue[i]+"  ");
		
		}
		else
			for(int i=front;i<=rear;i++)
				System.out.print(queue[i]+"  ");
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		QueueOperation obj = new QueueOperation();
		while(true){
			System.out.println("\nEnter the operation you want to perform\n1.Add item\n2.Delete item\n3.Chech whether Queue is full\n4.Chech whether Queue is Empty\n5.Exit");
			int choice=input.nextInt();
			switch(choice){
				case 1:	boolean check = obj.isFull();
						if(check==true){
							System.out.println("Queue is Full");
						}
						else{
							System.out.println("Enter the item to be inserted");
							int data = input.nextInt();
							obj.addElement(data);
							System.out.println("Your Queue is\n");
							obj.display();
						}	
						break;
				case 2: if(front == -1)
							System.out.println("Queue is already empty");
						else{
							obj.deleteElement();
							obj.display();
						}
						break;
				
				case 3:	check = obj.isFull();
						if(check==true){
							System.out.println("Queue is Full");
						}
						else
							System.out.println("Queue is not Full");
						break;
						
						
				case 4:	check = obj.isEmpty();
						if(check==true)
							System.out.println("Queue is Empty");
						else
							System.out.println("Queue is not Empty");
						break;
				case 5: System.exit(0);
				}
						 
			}
		}
	
}
