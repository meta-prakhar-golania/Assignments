package OragnicCompound;

/*@author Prakhar Golania
 * Main class
 * */
public class Main {

	public static void main(String[] args) {
		String compound="CH3(C4)4CH3(CH4)2O";
		OrganicCompound obj = new OrganicCompound();
		int size=compound.length();
		obj.calculateCompound(compound,size,1);
	}

}