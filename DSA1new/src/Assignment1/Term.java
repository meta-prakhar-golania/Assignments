package Assignment1;

/*@author Prakhar Golania
 * Class for creating term node
 * */
public class Term {
	public int coefficient;
	public Term next = null;
	public Power pow = null;
	
	public Term(int coefficient, Power tempHead) {
		this.coefficient = coefficient;
		this.pow = tempHead;
	}
	
	
}
