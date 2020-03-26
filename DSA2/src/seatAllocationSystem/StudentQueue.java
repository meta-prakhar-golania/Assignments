package seatAllocationSystem;

/*@author Prakhar Golania
 *class to add and retrieve students 
 * */
public class StudentQueue {
	private static int front = -1;
	private static int rear = -1;
	private static int maxSize=100;
	private static Student queue[] = new Student[100];

	static boolean addElement(Student item) {
		if (isFull())
			return false;
		else {
			if (rear == front && front == -1) {
				front = 0;
				queue[++rear] = item;
			}
			else{
				queue[++rear] = item;
			}
			return true;
		}
	}

	static Student deleteElement() {
		if (isEmpty())
			return null;
		else {
			Student item = queue[front];
			if (rear == front) {
				rear = -1;
				front = -1;
			}
			else
				front++;
			return item;
		}
	}

	static boolean isFull() {
		if ((rear + 1) % maxSize == front) {
			System.out.println("queue is full");
			return true;
		}
		return false;
	}

	static boolean isEmpty() {
		if (front == rear && rear == -1 && front==-1) {
			System.out.println("queue is empty");
			return true;
		}
		return false;
	}

}
