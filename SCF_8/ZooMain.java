import java.util.LinkedList;

/*Program to perform different zoo operation
 * like addition of animal cage or zone
 * 
 * */
public class ZooMain {

private LinkedList<Zone> listOfZones = new LinkedList<Zone>();
	
	public boolean addZone(int capacityOfCages, String zoneType, boolean hasPark, boolean hasCanteen){
		Zone zoneObj = new Zone(capacityOfCages, zoneType, hasPark, hasCanteen);
		listOfZones.push(zoneObj);
		return true;
	}
	
	public boolean addCageCapacity(String zoneType,String animalType, int capacity){
		Cage cageObj = new Cage(animalType, capacity);
		for(int i=0;i<listOfZones.size();i++){
			if(listOfZones.get(i).zoneType == zoneType && listOfZones.get(i).cageCapacity > listOfZones.get(i).listOfCages.size()){
				listOfZones.get(i).listOfCages.add(cageObj);
				return true;
			}
		}
		return false;
	}
	
	public boolean addAnimal(String animalType,int age,String name, String zoneType, int weight){
		Animals animalObj = ZooBack.addAnimal(animalType, age, name, weight);
		
		for(int i=0;i< listOfZones.size();i++){
			if(listOfZones.get(i).zoneType == zoneType){
				for(int j =0;j < listOfZones.get(i).listOfCages.size();j++){
					if(listOfZones.get(i).listOfCages.get(j).animalType == animalType &&listOfZones.get(i).listOfCages.get(j).capacity >listOfZones.get(i).listOfCages.get(j).listOfAnimal.size()){
						listOfZones.get(i).listOfCages.get(j).listOfAnimal.put(name, animalObj);
						return true;
					}
				}
			}
		}
		
		return false;
	}
	
	public boolean removeAnimal(String category,String breed,int id, String name){
		for(int i=0;i<listOfZones.size();i++){
			if(listOfZones.get(i).zoneType==category){
				for(int j =0;j<listOfZones.get(i).listOfCages.size();j++){
					if(listOfZones.get(i).listOfCages.get(j).animalType == breed){
						if(listOfZones.get(i).listOfCages.get(j).listOfAnimal.get(name).getId()==id){
							listOfZones.get(i).listOfCages.get(j).listOfAnimal.remove(1);
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {

	
		ZooMain obj = new ZooMain();
		
		boolean check = false;
		check = obj.addZone(2, "mammal",true,true);
		System.out.println(check);
		System.out.println("-------1--------");
		
		
		check = obj.addZone(4, "mammal",false,true);
		System.out.println(check);
		System.out.println("-------1--------");
		
		check = obj.addZone(1, "reptile",true, false);
		System.out.println(check);
		System.out.println("--------2-------");
		
		check = obj.addZone(1, "bird", true,true);
		System.out.println(check);
		System.out.println("---------3------");
		
		check = obj.addCageCapacity("mammal", "tiger", 2);
		System.out.println(check);
		System.out.println("----------4-----");
		
		check = obj.addCageCapacity("bird","eagle", 5);
		System.out.println(check);
		System.out.println("-----------5----");
		
		check = obj.addCageCapacity("reptile","crocodile", 10);
		System.out.println(check);
		System.out.println("----------6-----");
		
		check = obj.addAnimal("tiger", 10, "RamLal", "mammal", 50);
		System.out.println(check);
		System.out.println("-----------7----");
		
		check = obj.removeAnimal("mammal", "tiger", 1, "Ram");
		System.out.println(check);
		System.out.println("----------8-----");
		
		
		check = obj.addAnimal("eagle", 5, "Kuku", "bird", 10);
		System.out.println(check);
		System.out.println("----------9-----");
		
		check = obj.addAnimal("tiger", 10, "ramu", "mammal", 50);
		System.out.println(check);
		System.out.println("----------10-----");
	}
	
}
