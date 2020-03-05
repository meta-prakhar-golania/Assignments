package webservice;
import java.util.ArrayList;

/*Class to perform different operation
 * */
public class InventoryRepository {
	
	ArrayList<Inventory> inventory= new ArrayList<Inventory>();
	
	/*Constructor
	 * */
	public InventoryRepository(){		
		inventory.add(new Inventory("Apples",4));
		inventory.add(new Inventory("Oranges",7));
		inventory.add(new Inventory("Pomegranates",10));
	}
	
	/*Get the details of items
	 * @return inventory
	 * */
	public ArrayList<Inventory> getInventories(){
		return inventory;
	}
	
	/*Get details of particular item
	 * @param itemName to get name of item
	 * @return Inventory object
	 * */
	public Inventory getInventory(String itemName){
		for(Inventory item:inventory){
			if(item.getName().compareTo(itemName)==0)
				return item;
		}
		return new Inventory();
	}
	
	/*Add new item 
	 * @param newItem of type inventory 
	 * */
	public void create(Inventory newItem){
		inventory.add(newItem);
	}
	
	/*Update inventory
	 * @param newInventory of type inventory 
	 * */
	public void update(ArrayList<Inventory> newInventory){
		inventory.clear();		
		 for(Inventory item : newInventory)
			 inventory.add(item);
	}
	
	/*Update single item 
	 * @param name of item
	 * @param new item of type Inventory to update item
	 * */
	public void updateOne(String name,Inventory newItem){
		for(Inventory item:inventory){
			if(item.getName().compareTo(name)==0){
				item.setName(newItem.getName());
				item.setQuantity(newItem.getQuantity());
			}	
		}		
	}
	
	/*Delete single item from inventory
	 * @param itemName to delete an item
	 * */
	public void deleteOne(String itemName){
		inventory.remove(getInventory(itemName));
	}
	
	/*Delete all item from inventory
	 * */
	public void deleteAll(){
		inventory.removeAll(inventory);		
	}

}
