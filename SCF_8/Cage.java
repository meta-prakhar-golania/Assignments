import java.util.HashMap;

/*Program to store the detail of cages
 * */
public class Cage{

	private int cageId;
	String animalType;
	static int cageCounter=0;
	int capacity;
	HashMap<String,Animals> listOfAnimal = new HashMap<>();
	
	public Cage(String animalType, int capacity){
		this.animalType = animalType;
		this.capacity = capacity;
		this.cageId = cageCounter++;
	}
	
}
