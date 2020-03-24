package Assignment1;

/*@author Prakhar Golania
 * Class to perform List operation 
 * */
public class singleList {
	static Node header = null;
	static int length = 0;
	
	/*Function to add node in list
	 * @param list data
	 * */
	public static void addNode(int data) {
		Node newNode = new Node(data);
		length++;
		Node curr;
		if (header == null)
			header = newNode;
		else{
			curr = header;
			while(curr.next != null)
				curr = curr.next;
			curr.next = newNode; 
		}
	}
	
	/*Fucntion to display list
	 * */
	public static void display() {
		Node curr = header;
		while(curr != null){
			System.out.print("  " + curr.data);
			curr = curr.next;
		}
	}
	
	/*Function to perform rotating operation
	 * @param L=index from left
	 * @param R=index from right
	 * @param N=No. of rotation
	 * */
	private static void rotate(int L, int R, int N) {
		Node first=header,last=header,beg=null,end=null;
		while(L!=1){
			beg=first;
			first=first.next;
			L--;
		}
		while(R!=1){
			last=last.next;
			end=last.next;
			R--;
		}
		last.next=first;
		while(N!=0){
			first=first.next;
			last=last.next;
			N--;
		}
		last.next=end;
		beg.next=first;	
	}
	
	/*Function to detect loop
	 * @return boolean value
	 * */
	private static boolean detectLoop() {
		Node curr = header, fast = header;
		while(curr != null && fast != null && fast.next != null){
			curr = curr.next;
			fast = curr.next.next;
			if(curr == fast)
				return true;
		}
		return false;
	}
	
	public static void main(String[] args){
		int l=2, r=5, n=2;
		singleList.addNode(2);
		singleList.addNode(3);
		singleList.addNode(4);
		singleList.addNode(5);
		singleList.addNode(6);
		singleList.addNode(7);

		singleList.display();
		singleList.rotate(l, r, n);
		System.out.println("\nList After Rotating");
		singleList.display();

		header.next.next.next.next = header.next.next;
		if(singleList.detectLoop()){
			System.out.println("\nLoop is Detect");
		}
		else
			System.out.println("\nLoop is not Detect");
		
	}
}
