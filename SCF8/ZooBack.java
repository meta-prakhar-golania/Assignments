/*Program to check whether animal available in zoo
 * */
public class ZooBack {
	public static Animals addAnimal(String type,int age, String name, int weight){

		Animals animal = null;
		if("Lion".equalsIgnoreCase(type)){
			animal = new Eagle(name, age, weight);
		}
		
		if("Tiger".equalsIgnoreCase(type)){
			animal = new Tiger(name, age, weight);
		}
		
		if("Peacock".equalsIgnoreCase(type)){
			animal = new Peacock(name, age, weight);
		}
			
		if("Eagle".equalsIgnoreCase(type)){
			animal = new Eagle(name, age, weight);
		}
			
		if("Snake".equalsIgnoreCase(type)){
			animal = new Snake(name, age, weight);
		}
			
		if("Crocodile".equalsIgnoreCase(type)){
			animal = new Crocodile(name, age, weight);
		}
		return animal;
	}
}
