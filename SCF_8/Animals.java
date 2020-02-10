/**
 * 
 * @author Prakhar Golania
 * creating a base abstract class Animal
 *
 */
abstract public class Animals {
	private final String animalName;
	private final int age;
	private final int weight;
	private static int Id;
	
	public Animals(String animalName, int age, int weight){
		this.animalName = animalName;
		this.age = age;
		this.weight = weight;
		this.Id++;
	}
	abstract public void type();
	abstract public String getSound();
	


public static int getId(){
	return Id;
}
}
/**
 * SubClass of Animal Mammal
 */
abstract class Mammel extends Animals{
	
	public Mammel(String animalName, int age, int weight){
		super(animalName,age,weight);
	}
	public void type(){
		System.out.println("They having 4 legs");
	}
	
}

class Lion extends Mammel {
	
	Lion(String animalName, int age, int weight){
		super(animalName,age,weight);
		
	}
	public String getSound(){
		return "lion";
	}
}
class Tiger extends Mammel {
	
	Tiger(String animalName, int age, int weight){
		super(animalName,age,weight);
		
	}
	public String getSound(){
		return "Tiger";
	}
}


/**
 * SubClass of Animal Reptile
 */

abstract class Reptile extends Animals{
	
	public Reptile(String animalName, int age, int weight){
		super(animalName,age,weight);
	
	}
	public void type(){
		System.out.println("They having no legs");
	}
	
}

class Snake extends Reptile{
	Snake(String animalName, int age, int weight){
		super(animalName, age , weight );
		
	}

	@Override
	public String getSound() {
		return "Snake";
	}
}
class Crocodile extends Reptile{
	Crocodile(String animalName, int age, int weight){
		super(animalName, age , weight );
		
	}

	@Override
	public String getSound() {
		return "Crocodile";
	}
}

/**
 * SubClass of Animal Bird
 */

abstract class Bird extends Animals{
	
	public Bird(String animalName, int age, int weight){
		super(animalName,age,weight);
	}
	public void type(){
		System.out.println("They having no legs");
	}
	
}
class Peacock extends Bird{
	 Peacock(String animalName, int age, int weight){
		 super(animalName, age, weight);
	 }
	 
	@Override
	public String getSound() {
		return "Peacock";
	}
 }

class Eagle extends Bird{
	 Eagle(String animalName, int age, int weight){
		 super(animalName, age, weight);
	 }
	 
	@Override
	public String getSound() {
		return "Eagle";
	}
}