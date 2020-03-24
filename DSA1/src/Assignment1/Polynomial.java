package Assignment1;

/*@author Prakhar Golania
 * Class to represent the multivariate polynomial
 * */
public class Polynomial {
	static Term termHeader = null;
	static Power powerHeader;
	
	
	private static boolean addTerm(int coff, int[] power) {
		int i = 0;
		powerHeader = null;
		while (i != power.length){
			Power newNode1 = new Power(power[i]);
			System.out.print(power[i]+" ");
			if (powerHeader == null)
				powerHeader = newNode1;
			else{
				Power curr = powerHeader;
				while (curr.next != null)
					curr = curr.next;
				curr.next = newNode1;
			}
			i++;
		}

		System.out.println("\n");
		Term newNode = new Term(coff, powerHeader);
		if (termHeader == null)
			termHeader = newNode;
		else{
			Term curr = termHeader;
			while (curr.next != null)
				curr = curr.next;
			curr.next = newNode;
		}
		return true;
	}
	
	private static void display() {
		Term curr = termHeader;
		char[] ch = {'x','y','z'};
		
		while (curr != null){
			int i = 0;
			System.out.print(curr.coefficient);
			Power pheader = curr.pow;
			while( i < ch.length){
				if(pheader.degreeOfVariant==0)
					i++;
				else{
					System.out.print(ch[i++]);
					System.out.print("^"+pheader.degreeOfVariant);
				}
				pheader = pheader.next;
			}
			if(curr.next!=null)
				System.out.print(" + ");
			curr = curr.next;
		}
	}
	
	public static int degreeOfPoly(){
		int degree=0;
		int tempDegree=0;
		Term header1=termHeader;
		while(header1!=null){
			Power header2=header1.pow;
			while(header2!=null){
				tempDegree=tempDegree+header2.degreeOfVariant;
				header2=header2.next;
			}
			if(degree<tempDegree)
				degree=tempDegree;
			tempDegree=0;
			header1=header1.next;
		}
		return degree;	
	}
	
	public static void main(String[] args){
		int[] a = {2,0,0};
		Polynomial.addTerm(2,a);
		int[] b = {0,1,0};
		Polynomial.addTerm(3,b);
		int[] c = {3,1,0};
		Polynomial.addTerm(4,c);
		Polynomial.display();
		
		int degree=degreeOfPoly();
		System.out.println("\nDegree of Polynomial:"+degree);
	}
}
